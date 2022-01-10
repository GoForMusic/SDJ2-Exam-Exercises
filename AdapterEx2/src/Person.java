import java.util.Date;

public class Person {
    private String name;
    private String dateOfBirth;
    private int socialSecurityNumber;

    public Person(String name, int socialSecurityNumber,String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
