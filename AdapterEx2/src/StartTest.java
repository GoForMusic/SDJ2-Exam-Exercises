public class StartTest {
    public static void main(String[] args) {
        FilePersonStorage storage = new FilePersonStorage();
        (new UIPersonStorage(storage)).start();

    }
}
