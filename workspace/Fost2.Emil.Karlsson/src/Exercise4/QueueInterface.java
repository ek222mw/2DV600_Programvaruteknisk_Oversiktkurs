package Exercise4;
/**
 * QueueInterface.java
 * Updated with exceptions 9 sep 2015
 */

import java.util.Iterator;
import java.lang.IndexOutOfBoundsException;



public interface QueueInterface<E> {  
    int size();                          // current queue size 
    boolean isEmpty();                   // true if queue is empty 
    void enqueue(E element);             // add element at end of queue 
    E dequeue();                         // return and remove first element. 
    E first();                           // return (without removing) first element 
    E last();                            // return (without removing) last element 
    Iterator<E> iterator();             // element iterator
}

