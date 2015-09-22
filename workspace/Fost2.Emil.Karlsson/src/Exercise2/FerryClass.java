package Exercise2;

import java.util.ArrayList;
import java.util.Iterator;



public class FerryClass implements Ferry {

	public final int max_passenger = 200;
	public final int max_cars = 40;
	public final int max_space = 200;
	ArrayList<Vehicle> vehiclelist = new ArrayList<>();
	ArrayList<Passenger> passlist = new ArrayList<>();
	private int moneyearn = 0;
	private int id = 0;
	private QueueHelper startVal;
	
	@Override
	public int countPassengers() {
		int passenger = 0;
		for(int i=0; i<vehiclelist.size();i++)
		{
			
			passenger += vehiclelist.get(i).getPassenger();
			//vehiclelist.get(i).setPassenger(passenger,vehiclelist.get(i).getPassengerfee());
			
		}
		
		
		for(int i=0; i<passlist.size();i++)
		{
			passenger += passlist.get(i).getPassengers();
			//passlist.get(i).addPassengers(passenger,passlist.get(i).fee);
			
		}
		return passenger;
	}

	@Override
	public int countVehicleSpace() {
		int count=0;
		for(int i=0; i<vehiclelist.size();i++)
		{
			count += vehiclelist.get(i).getSize();
			vehiclelist.get(i).setSize(count);
			
			
		}
		
		
		return count;
	}

	@Override
	public int countMoney() {
		int money = 0;
		for(int i = 0; i<passlist.size(); i++)
		{
			money += passlist.get(i).getPassengerFee();
		}
		
		for(int i =0; i<vehiclelist.size();i++)
		{
			money += vehiclelist.get(i).getTotalFee();
			
		}
		
		return money;
	}

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

	@Override
	public void embark(Vehicle v) {
		boolean goOn = true;
		for(int i = 0; i<vehiclelist.size();i++)
		{
			
			if(vehiclelist.get(i).getID() == v.getID())
			{
				goOn = false;
				try {
					throw new Exception("Error vehicle id already exists .");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		if(goOn)
		{
			if(hasSpaceFor(v))
			{
				vehiclelist.add(v);
				
			}
			if(v.getPassenger() > 0)
			{
				passlist.add(new Passenger(v.getPassenger()));
			}
		}
		
	}

	@Override
	public void embark(Passenger p) {
		
		if(hasRoomFor(p))
		{
			passlist.add(p);
		}
		
	}

	@Override
	public void disembark() {
		moneyearn = countMoney();
		passlist.clear();
		vehiclelist.clear();
		
		
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
	
		
		if(v.getTotSpace() <= max_space)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		
		if(p.getPassengers() <= max_passenger)
		{
			return true;
		}
		
		
		return false;
	}
	
	public int generateID()
	{	
		id = id +1;
		return id;
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

}
