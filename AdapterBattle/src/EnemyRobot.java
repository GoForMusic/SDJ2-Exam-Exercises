import java.util.Random;

public class EnemyRobot {

    Random random = new Random();

    public void smashWithHands(){
        int attackDamage = random.nextInt(10) +1;
        System.out.println("Enemy robot causes " + attackDamage+ " damage with his hands");
    }

    public void walkForward()
    {
        int movement = random.nextInt(5) + 1;
        System.out.println("The robot is walking forward" + movement + " meters");
    }

    public void reactToHuman(String driver){
        System.out.println("Enemy robot tramps on " + driver);
    }
}
