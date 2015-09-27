package Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Vehicle {
	//private fields.
	private int countSpace;
	private int countVehicles;
	private int countPass;
	private int id;
	private int size = 0;
	private int sizePass = 0;
	private int fee = 0;
	private int totpassengerfee = 0;
	private int vehiclefee = 0;
	private int passengerfee = 0;
	private int bicyclepassenger = 0;
	
	
	//gets tot space.
	public int getTotSpace()
	{
		return countSpace;
	}
	
	//gets passengers.
	public int getPassenger()
	{
		return (sizePass+bicyclepassenger);
	}
	//gets tot passengers.
	public int getTotPassenger()
	{
		return countPass;
	}
	//gets size.
	public int getSize()
	{
		return size;
	}
	//get vehicles.
	public int getTotVehicles()
	{
		return countVehicles;
	}
	//get vehicle fee.
	public int getVehicleFee()
	{
		return vehiclefee;
	}
	//gets passenger fee.
	public int getPassengerfee()
	{
		return passengerfee;
	}
	//gets id.
	public int getID()
	{
		return id;
	}
	//set vehicles.
	public void setTotVehicles(int v)
	{
		countVehicles += v;
	}
	//sets id.
	public void setID(int id)
	{
		this.id = id;
	}
	//sets size.
	public void setSize(int v)
	{
		size = v;
		countSpace += v;
	}
	//gets total fee.
	public int getTotalFee()
	{
		return (this.fee+totpassengerfee);
	}
	//sets fee.
	public void setFee(int fee)
	{
		vehiclefee = fee;
		this.fee += fee;
	}
	//sets passengers with number passengers and fees. And counts them.
	public void setPassenger(int p, int fee)
	{
		sizePass = p;
		countPass += p;
		passengerfee = fee;
		totpassengerfee += p * fee;
	}
	
	//sets bicycle passengers.
	public void setBicyclePassenger(int bicycles)
	{
		bicyclepassenger += bicycles;
	}
	
	
	
	
}
