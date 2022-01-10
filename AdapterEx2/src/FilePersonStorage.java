import java.io.*;
import java.util.Date;

public class FilePersonStorage implements PersonStorage{

    private File file;
    private FileWriter fw;

    public FilePersonStorage(){
        file = new File("PersonStorage");
        try {
            fw = new FileWriter(file,true);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addPerson(Person prsn) {
        Person existingPerson = getPerson(prsn.getSocialSecurityNumber());
        if(existingPerson!=null) throw new IllegalStateException("Person already exisit");

        String toWrite = prsn.getSocialSecurityNumber() + ";"+prsn.getName()+";"+prsn.getDateOfBirth();
        try {
            fw.append(toWrite);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Person getPerson(int ssn) {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while(line!=null){
                String[] split = line.split(";");
                int temp = Integer.parseInt(split[0]);
                if(ssn==temp){
                    Person toReturn  = new Person(split[1],temp,split[2]);
                    return toReturn;
                }else{
                    System.out.println("SNN not found: " + temp);
                    return null;
                }
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
