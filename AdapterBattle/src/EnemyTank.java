import java.util.Random;

public class EnemyTank implements EnemyAttacker{

    Random random = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = random.nextInt(10) +1;
        System.out.println("Enemy tank does " + attackDamage + " damage");
    }

    @Override
    public void driveForward() {
        int movement  = random.nextInt(5) +1;
        System.out.println("Enemy tank moves " + movement + " meters");
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println(driver + " is driving the tank");
    }
}
