package Exercise2;

public class Bus extends Vehicle{
	
	public final int space = 20;
	public final int fee = 200;
	public final int passengerfee = 10;
	
	public Bus(int passengers, int id)
	{
		 setID(id);
		 setSize(space);
		 setPassenger(passengers,passengerfee);
		 setFee(fee);
		 
		
	}
	
	

}
