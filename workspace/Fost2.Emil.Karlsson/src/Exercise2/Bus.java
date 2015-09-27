package Exercise2;

public class Bus extends Vehicle{
	//public fields
	public final int space = 20;
	public final int fee = 200;
	public final int passengerfee = 10;
	//bus constructor
	public Bus(int passengers, int id)
	{	//if passengers less than 21 continue else print error msg.
		if(passengers < 21)
		{
		//set id
		 setID(id);
		 //set size
		 setSize(space);
		 //set passengers with fee
		 setPassenger(passengers,passengerfee);
		 //setfee for bus.
		 setFee(fee);
		 //adds vehicle counter.
		 setTotVehicles(1);
		}
		else
		{
			System.out.println("Max passengers on bus is 20");
		}
		 
		
	}
	
	

}
