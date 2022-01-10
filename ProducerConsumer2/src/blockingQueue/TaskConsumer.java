package blockingQueue;

public class TaskConsumer implements Runnable{

    private String name;
    private blockingQueue queue;

    public TaskConsumer(blockingQueue queue, int id) {
        this.queue = queue;
        name = "Consumer " + id;
    }

    @Override
    public void run() {

        while(true){
            Task task = queue.retrieve();
            int result = task.a + task.b;
            System.out.println(name +  " calculated result: " + result );
        }

    }
}
