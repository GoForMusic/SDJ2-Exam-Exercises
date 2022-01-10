import java.util.Random;

public class EnemyRobotAdapter implements EnemyAttacker{

    private EnemyRobot robot;

    public EnemyRobotAdapter(EnemyRobot robot) {
        this.robot = robot;
    }

    @Override
    public void fireWeapon() {

        robot.smashWithHands();

    }

    @Override
    public void driveForward() {
        robot.walkForward();
    }

    @Override
    public void assignDriver(String arg) {
        robot.reactToHuman(arg);
    }
}
