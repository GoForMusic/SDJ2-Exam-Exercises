package Practice;

import java.util.Random;

public class RunExample
{


    public static void main(String[] args)
    {
        ReaderPreference rp = new ReaderPreference();
        for (int i = 0; i <3 ; i++) {
            new Thread(() -> {
                while (true)
                {
                    rp.acquireWriter();
                    rp.incrementInt();
                    System.out.println("\t\t\t\t\t\t Writer incremented");
                    rp.releaseWriter();
                    try
                    {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {}
                }
            }).start();


        }
        for (int i = 0; i <10 ; i++)
        {
            rp.acquireReader();
            int finalI = i;
            new Thread(()->{
                while (true)
                {
                    rp.acquireReader();
                    System.out.println("reader " + finalI + ": " + rp.readInt());
                    rp.releaseReader();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignored) {}
                }
            }).start();

        }
    }
}
