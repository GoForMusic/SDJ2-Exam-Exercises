package blockingQueue;

public class StartTaskExample {


    public static void main(String[] args) {

        blockingQueue queue  = new blockingQueue( 10);

        for (int i = 0; i <10 ; i++) {

            Thread producer = new Thread(new TaskProducer(queue, i));
            Thread consumer  = new Thread(new TaskConsumer(queue, i));
            producer.start();
            consumer.start();
        }
    }
}
