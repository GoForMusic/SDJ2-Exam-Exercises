package Animals;

public class Start{

    public static void main(String[] args){

        Animal Svend = new Dog();
        Animal Peri = new Bird();

        System.out.println("Svend: " + Svend.tryToFly());

        System.out.println("Peri: " + Peri.tryToFly());



        Svend.setFlyingAbility(new ItFlys());

        System.out.println("Svend: " + Svend.tryToFly());

    }

}