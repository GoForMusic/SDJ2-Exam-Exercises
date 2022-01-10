package blockingQueue;

import java.util.Random;

public class TaskProducer implements Runnable{

    private blockingQueue queue;
    private String name;


    public TaskProducer(blockingQueue queue, int id) {
        this.queue = queue;
        name = "Producer " + id;
    }

    @Override
    public void run() {

        Random rand = new Random();
        while (true){
            int a  = rand.nextInt(100);
            int b  = rand.nextInt(100);
            Task t = new Task(a,b);
            queue.add(t);
            System.out.println(name + " added task" + "(" + a + ", " +b+ ")");
        }

    }
}
