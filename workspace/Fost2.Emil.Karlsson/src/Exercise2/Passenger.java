package Exercise2;

public class Passenger {
	
	//fields.
	private int countPassenger;
	public final int fee = 20;
	private int totalfee;
	
	//constructor with passenger.
	public Passenger(int passenger) {
		
		
		
	}
	//constructor.
	public Passenger()
	{
		
	}
	
	//gets passengers.
	public int getPassengers()
	{
		return countPassenger;
	}
	//get passenger fee.
	public int getPassengerFee()
	{
		return totalfee;
	}
	//sets passenger.
	public void setPassenger(int p)
	{
		countPassenger +=p;
	}
	//adds passengers and fees.
	public void addPassengers(int p, int fee)
	{
		
			setPassenger(p);
			totalfee = (fee * p);
		
	}
	
	
}
