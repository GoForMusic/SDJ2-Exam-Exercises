package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private QueueADT<String> q;

    // arrange
    @BeforeEach
    public void createQueue()
    {
      q = new BoundaryArrayQueue(5);
    }

    @Test
    public void addedElementIsInQueue()
    {
        // act
        q.enqueue("A");
        //assert
        assertTrue(q.contains("A"));
        System.out.println("element found");
    }

    @Test
    public void addMultipleElementsToQueue()
    {

        //act
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.enqueue("D");
        q.enqueue("E");

        //assert
        assertTrue(q.contains("A"));
        assertTrue(q.contains("B"));
        assertTrue(q.contains("C"));
        assertTrue(q.contains("D"));
        assertTrue(q.contains("E"));
        System.out.println("containg elemenets done");
    }

    @Test
    public void sizeIs4AfterAdding4Elements()
    {

        //act
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.enqueue("D");

        //assert
        assertTrue(4 == q.size());
        assertEquals(4, q.size());
        System.out.println("size done");
    }

    @Test
    public void nullArgumentResultsInIllegalArgumentException()
    {
        //assert
        assertThrows(IllegalArgumentException.class, () -> q.enqueue(null));
    }

    @Test
    public void fullQueueResultInIllegalStateException()
    {
        //act
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.enqueue("D");
        q.enqueue("E");

        //assert
        assertThrows(IllegalStateException.class, () -> q.enqueue("F"));
    }


    @Test

    public void emptyQueueDoesntContainElementA()
        {
            //assert
            assertTrue(q.contains("A"));

            //act
            q.enqueue("B");
            q.enqueue("C");
            q.enqueue("D");
            q.enqueue("E");
        }
}