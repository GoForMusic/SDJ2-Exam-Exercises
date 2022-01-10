package queue;

public class Run {
    public static void main(String[] args) {
        BoundaryArrayQueue queue = new BoundaryArrayQueue(5);
        queue.enqueue("A");

        queue.enqueue("B");

        queue.enqueue("C");

        queue.enqueue("D");

        queue.enqueue("E");
        System.out.println(queue.toString());
    }
}
