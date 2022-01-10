package queue;

import java.util.ArrayList;
import java.util.List;

public class BoundaryArrayQueue implements QueueADT {
    private int cap;
    private List<String> list = new ArrayList<>();


    public BoundaryArrayQueue(int cap) {
        this.cap = cap;
    }

    public String toString()
    {
      return list.toString();

    }


    @Override
    public void enqueue( Object element) throws IllegalArgumentException, IllegalStateException{  // add new element to the queue
        if(element == null){
            throw new IllegalArgumentException();
        }
        else if (list.size() > cap) {
            throw new  IllegalStateException();
        } else list.add((String) element);
    }

    @Override
    public Object dequeue() {
        if (list.isEmpty()) throw new IllegalStateException();
        else {
            String temp = list.get(0);
            list.remove(0);
            return temp;
        }
    }

    @Override
    public Object first() {
        if (list.isEmpty()) throw new IllegalStateException();
        else return list.get(0);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int indexOf(Object element) {
        if( list.indexOf(element) >= list.size()) return -1;
        else return list.indexOf(element);
    }

    @Override
    public boolean contains(Object element) {
        if (list.contains(element)) return true;
        else return false;
    }
}
