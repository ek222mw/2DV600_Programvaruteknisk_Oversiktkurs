package Queue;

import java.util.Iterator;

public class Queue {
	 
    public static void main(String[] args) {
    	
    	try{
    		
    	
        QueueList queueList = new QueueList();
 
        // add elements to queueList
        queueList.enqueue("1");
        queueList.enqueue("2");
        queueList.enqueue("3");
        queueList.enqueue("4");
        queueList.enqueue("5");
        //removes elements to queueList
        queueList.dequeue();
        queueList.dequeue();
        
        
        //Returns and prints out the first value
        System.out.println("QueueList.first() - print linkedlist first: " + queueList.first());
        //Returns and prints out the last value
        System.out.println("QueueList.last() - print linkedlist last: " + queueList.last());
        //Returns and prints size.
        System.out.println("QueueList.size() - print linkedlist size: " + queueList.size());
        //Returns true if empty else false and prints it.
        System.out.println("QueueList.IsEmpty() - print true if empty else false: " + queueList.isEmpty());
        //Returns true if inputed value matches any value in list. 
        System.out.println("QueueList.contains() - true if exists else false: " + queueList.contains("3"));
        //Creates Iterator.
        Iterator it = queueList.iterator();
        //Returns true as long as iterator has values.
        while(it.hasNext())
        {	//Prints out every value in iterator.
        	System.out.println("QueueList.iterator() - print iterator values: " + it.next());
        }
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
 
class QueueList implements QueueInterface{
    //private fields
    private QueueHelper startVal;
    private int queuelistCounter;
 
    //Constructor
    public QueueList() {
        
        startVal = new QueueHelper(null);
        queuelistCounter = 0;
    }
 
    private class QueueHelper {
        //fields.
        QueueHelper qHelper;
        Object dataVal;
 
        // QueueHelper constructor
        public QueueHelper(Object dataValue) {
            qHelper = null;
            dataVal = dataValue;
        }
 
        
        public QueueHelper(Object dataValue, QueueHelper nextValue) {
            qHelper = nextValue;
            dataVal = dataValue;
        }
 
        //returns datavalue.
        public Object getD() {
            return dataVal;
        }
        //sets datavalue.
        public void setD(Object dataValue) {
            dataVal = dataValue;
        }
        //returns next value in qHelper.
        public QueueHelper getNext() {
            return qHelper;
        }
        //sets the next in qHelper.
        public void setNext(QueueHelper nextValue) {
            qHelper = nextValue;
        }
    }

    //Returns size of elements, overrides interface method.
    @Override
    public int size()
    {
    	return queuelistCounter;
    }
    //Checks if empty, overrides interface method.
	@Override
	public boolean isEmpty() {
		QueueHelper queueCurr = startVal;
		
		if(queueCurr.getNext() == null)
		{
			return true;
		}
		
		return false;
	}
	//Add element.
	@Override
	public void enqueue(Object element) {
		
		    QueueHelper queueTemp = new QueueHelper(element);
	        QueueHelper queueCurr = startVal;
	        
	        while (queueCurr.getNext() != null) {
	        	queueCurr = queueCurr.getNext();
	        }
	        
	        queueCurr.setNext(queueTemp);
	        queuelistCounter++;// 
	    
		
	}
	//Removes element.
	@Override
	public Object dequeue() throws IndexOutOfBoundsException {
		
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Error no value to remove.");
		}
		QueueHelper queueCurr = startVal;
		
		QueueHelper queueTemp = queueCurr.getNext();
		
		
		queueCurr.setNext(queueTemp.getNext());
		queuelistCounter--;
		
		
		
		return queueTemp.getD();
	}
	//Returns first element.
	@Override
	public Object first() throws IndexOutOfBoundsException {
		
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Error no value found.");
		}
		
		QueueHelper currenthead = startVal;
		currenthead.getNext();
		
		return currenthead.getNext().getD();
	}
	//Returns last element.
	@Override
	public Object last() throws IndexOutOfBoundsException {
		
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Error no value found.");
		}
		
        QueueHelper queueCurr = startVal;
        // starting at the head node, crawl to the end of the list
        while (queueCurr.getNext() != null) {
        	queueCurr = queueCurr.getNext();
        }
        // the last node's "next" reference set to our new node
        queueCurr.getNext();
		
		return queueCurr.getD();
	}
	//Returns true if Object o exists else false.
	@Override
	public boolean contains(Object o) {
		
		
		QueueHelper queueCurr = startVal;
		 while (queueCurr.getNext() != null) {
			if(queueCurr.getNext().getD() ==o)
			{
				return true;
			}
			
		 }
		 return false;
	}

	//returns iterator which contains all elements.
	@Override
	public Iterator iterator() {
		
		
		return new Iterator(){
			QueueHelper queueCurr = startVal;
			@Override
			public boolean hasNext() {
				
				queueCurr = queueCurr.getNext();
				
				if(queueCurr != null)
				{
					return true;
				}
				
				return false;
			}

			@Override
			public Object next() {
				
				return queueCurr.getD();
			}};
	
	}
	
	


	
	


	
	
	
	

	

	
}