package Exercise4;

import java.util.Iterator;

public class Queue {
	 
    public static void main(String[] args) {
    	
    	try{
    		
    	
        QueueList<String> queueList = new QueueList<String>();
 
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
               //Creates Iterator.
        Iterator<String> it = queueList.iterator();
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
 
class QueueList<E> implements QueueInterface<E>{
    //private fields
    private QueueHelper<E> startVal;
    private int queuelistCounter;
 
    //Constructor
    public QueueList() {
        
        startVal = new QueueHelper<E>(null);
        queuelistCounter = 0;
    }
 
    private class QueueHelper<E> {
        //fields.
        QueueHelper<E> qHelper;
        E dataVal;
 
        // QueueHelper constructor
        public QueueHelper(E dataValue) {
            qHelper = null;
            dataVal = dataValue;
        }
 
        
        public QueueHelper(E dataValue, QueueHelper<E> nextValue) {
            qHelper = nextValue;
            dataVal = dataValue;
        }
 
        //returns datavalue.
        public E getD() {
            return dataVal;
        }
        //sets datavalue.
        public void setD(E dataValue) {
            dataVal = dataValue;
        }
        //returns next value in qHelper.
        public QueueHelper<E> getNext() {
            return qHelper;
        }
        //sets the next in qHelper.
        public void setNext(QueueHelper<E> nextValue) {
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
		QueueHelper<E> queueCurr = startVal;
		
		if(queueCurr.getNext() == null)
		{
			return true;
		}
		
		return false;
	}
	//Add element.
	@Override
	public void enqueue(E element) {
		
		    QueueHelper<E> queueTemp = new QueueHelper<E>(element);
	        QueueHelper<E> queueCurr = startVal;
	        
	        while (queueCurr.getNext() != null) {
	        	queueCurr = queueCurr.getNext();
	        }
	        
	        queueCurr.setNext(queueTemp);
	        queuelistCounter++;// 
	    
		
	}
	//Removes element.
	@Override
	public E dequeue() throws IndexOutOfBoundsException {
		
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Error no value to remove.");
		}
		QueueList<E>.QueueHelper<E> queueCurr = startVal;
		
		QueueList<E>.QueueHelper<E> queueTemp = queueCurr.getNext();
		
		
		queueCurr.setNext(queueTemp.getNext());
		queuelistCounter--;
		
		
		
		return queueTemp.getD();
	}
	//Returns first element.
	@Override
	public E first() throws IndexOutOfBoundsException {
		
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Error no value found.");
		}
		
		QueueList<E>.QueueHelper<E> currenthead = startVal;
		currenthead.getNext();
		
		return currenthead.getNext().getD();
	}
	//Returns last element.
	@Override
	public E last() throws IndexOutOfBoundsException {
		
		if(isEmpty())
		{
			throw new IndexOutOfBoundsException("Error no value found.");
		}
		
        QueueList<E>.QueueHelper<E> queueCurr = startVal;
        // starting at the head node, crawl to the end of the list
        while (queueCurr.getNext() != null) {
        	queueCurr = queueCurr.getNext();
        }
        // the last node's "next" reference set to our new node
        queueCurr.getNext();
		
		return queueCurr.getD();
	}
	
	//returns iterator which contains all elements.
	@Override
	public Iterator<E> iterator() {
		
		
		return new Iterator<E>(){
			QueueHelper<E> queueCurr = startVal;
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
			public E next() {
				
				return queueCurr.getD();
			}};
	
	}
	
	


	
	


	
	
	
	

	

	
}