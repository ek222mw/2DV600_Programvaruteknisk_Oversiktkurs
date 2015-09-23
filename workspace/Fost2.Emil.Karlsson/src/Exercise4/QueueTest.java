package Exercise4;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator; 

public class QueueTest {
	QueueList<String> queueList = new QueueList<String>();
	
	@Test
	public void Test()
	{
		
		
		 // add elements to queueList
        queueList.enqueue("1");
        queueList.enqueue("2");
        queueList.enqueue("3");
        queueList.enqueue("4");
        queueList.enqueue("5");
        //checks if list contains five elements.
        assertEquals((Object)5,(Object)queueList.size());
        //checks if last added in list is 5.
        assertEquals((Object)"5",(Object)queueList.last());
        
        //removes elements to queueList
        queueList.dequeue();
        queueList.dequeue();
        //checks if list contains three elements
        assertEquals((Object)3,(Object)queueList.size());
        //checks if first in list is three instead of one.
        assertEquals((Object)"3",(Object)queueList.first());
        //checks if last in list is 5.
        assertEquals((Object)"5",(Object)queueList.last());
        
        //checks if list is empty, if not test returns true.
        assertTrue(queueList.isEmpty() == false);
        
        Iterator<String> it = queueList.iterator();
        //init counter
        int count = 3;
        //Returns true as long as iterator has values.
        while(it.hasNext())
        	//convert int to string to match type in assertEquals.
        {	 String number = Integer.toString(count);
        	//checks if order is 3,4,5.
        	 assertEquals((Object)number,(Object)it.next());
        	 count++;
        }
        
        
        queueList.dequeue();
        queueList.dequeue();
        queueList.dequeue();
        //checks if list is empty, if it's test returns true.
        assertTrue(queueList.isEmpty() == true);
       
                
        //adds 10000 elements
        for(int i =0;i<10000;i++)
        {
        	queueList.enqueue("1");
        }
        //checks if size is 10000
        assertEquals((Object)10000,(Object)queueList.size());
        
		
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException1() {
		//test if throw exception on dequeue on empty list.
        queueList.dequeue();
       
    }
	
	@Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException2() {
		//test if throw exception on last on empty list.
        queueList.last();
        
    }
	@Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException3() {
		//test if throw exception on first on empty list.
        queueList.first();
    }
	
	

}
