package Exercise2;

public class Passenger {
	
	
	private int countPassenger;
	public final int fee = 20;
	private int totalfee;
	
	
	public Passenger(int passenger) {
		
		
		
	}
	
	public Passenger()
	{
		
	}
	

	public int getPassengers()
	{
		return countPassenger;
	}
	
	public int getPassengerFee()
	{
		return totalfee;
	}
	
	public void addPassengers(int p, int fee)
	{
		countPassenger += p;
		totalfee = (fee * p);
	}
	
	
}
