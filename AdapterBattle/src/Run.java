public class Run {

    public static void main(String[] args) {
        EnemyTank Leopard1 = new EnemyTank();
        EnemyRobot OptimusPrime = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(OptimusPrime);

        System.out.println("The robot");
        OptimusPrime.reactToHuman("Marian");
        OptimusPrime.walkForward();
        OptimusPrime.smashWithHands();

        System.out.println("The enemy tank");

        Leopard1.assignDriver("Cristian");
        Leopard1.driveForward();
        Leopard1.fireWeapon();

        System.out.println("The robot with adapter");

        robotAdapter.assignDriver("Radu");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();


    }
}
