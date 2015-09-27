package Exercise3;
import org.junit.Test;
import static org.junit.Assert.*; 

public class CollectionTest  {

	
	@Test
	public void testMulty()
	{	//new instances of classes.
		ArrayIntList ail = new ArrayIntList();
		ArrayIntStack ais = new ArrayIntStack();
		//List test.
		//adds 1
		ail.add(1);
		//Test if first element is 1
		assertEquals((Object)1,(Object)ail.get(0));
		//checks if size is equal to 1
		assertEquals((Object)1,(Object)ail.size);
		
		//removes first element.
		ail.remove(0);
		//checks if first element was removed.
		assertEquals((Object)0,(Object)ail.get(0));
		//checks if size is 0
		assertEquals((Object)0,(Object)ail.size);
		
		//adds 3.
		ail.add(3);
		//adds 7 at index 0.
		ail.addAt(7, 0);
		//checks if index 0 has value 7
		assertEquals((Object)7,(Object)ail.get(0));
		//checks if index 1 equals 3
		assertEquals((Object)3,(Object)ail.get(1));
		//checks if size is equal to 1.
		assertEquals((Object)2,(Object)ail.size);
		//checks if value 7 has index 0.
		assertEquals((Object)0,(Object)ail.indexOf(7));
		
		//Stack test
		//add 3 and 7
		ais.push(3);
		ais.push(7);
		//checks if size is 2
		assertEquals((Object)2,(Object)ais.size);
		//checks if value 7 is top of stack
		assertEquals((Object)7,(Object)ais.peek());
		//removes last added element that is 7.
		ais.pop();
		//checks if size is 1
		assertEquals((Object)1,(Object)ais.size);
		//checks if 7 is removed. Then last added value should be 3.
		assertEquals((Object)3,(Object)ais.peek());
		
		
		
		
	}
	
	
}
