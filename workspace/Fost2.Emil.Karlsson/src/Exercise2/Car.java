package Exercise2;

public class Car extends Vehicle {
	//public fields.
	public final int space =5;
	public final int fee = 100;
	public final int passengerfee = 15;
	
	public Car(int passengers, int id)
	{
		//checks if passengers is less than 5.
	     if(passengers < 5)
	     {	 //sets fields.
			 setID(id);
			 setSize(space);
			 setPassenger(passengers,passengerfee);
			 setFee(fee);
			 setTotVehicles(1);
	     }
	     else
	     {
	    	 System.out.println("Max passengers in car is 4");
	     }
		 
		
	}
	
		
	
	
	
	
	
}
