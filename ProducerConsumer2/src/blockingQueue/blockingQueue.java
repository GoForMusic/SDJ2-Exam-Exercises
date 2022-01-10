package blockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class blockingQueue {

    private Queue<Task> queue;
    private int capacity;

    public blockingQueue(int cap){
        queue = new LinkedList<>();
        capacity = cap;

    }

    public synchronized void add(Task task){
        while(queue.size() >= capacity){
            try {
                System.out.println("Queue was full");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(task);
        notifyAll();
    }

    public synchronized Task retrieve()
    {
        while(queue.isEmpty()){
            try {
                System.out.println("Queue was empty");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Task task = queue.poll(); // removing the next element of the queue.
        notifyAll();
        return task;
    }

}
