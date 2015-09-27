package Exercise2;

public class Lorry extends Vehicle {
	//public fields
	public final int space = 40;
	public final int fee = 300;
	public final int passengerfee = 15;
	
	public Lorry(int passengers, int id)
	{	 //checks if passengers is less than 3.
		 if(passengers < 3)
		 {	 //sets fields.
			 setID(id);
			 setSize(space);
			 setPassenger(passengers,passengerfee);
			 setFee(fee);
			 setTotVehicles(1);
		 }
		 else
		 {
			 System.out.println("Max passengers in Lorry is 2");
		 }
		 
		
	}

}
