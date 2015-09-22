package Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Vehicle {

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
	
	
	
	public int getTotSpace()
	{
		return countSpace;
	}
	
	
	
	public int getPassenger()
	{
		return (sizePass+bicyclepassenger);
	}
	
	public int getTotPassenger()
	{
		return countPass;
	}
	
	
	public int getSize()
	{
		return size;
	}
	
	public int getTotVehicles()
	{
		return countVehicles;
	}
	
	public int getVehicleFee()
	{
		return vehiclefee;
	}
	
	public int getPassengerfee()
	{
		return passengerfee;
	}
	
	public int getID()
	{
		return id;
	}
	
	
	public void setTotVehicles(int v)
	{
		countVehicles += v;
	}
	public void setID(int id)
	{
		this.id = id;
	}
	
	public void setSize(int v)
	{
		size = v;
		countSpace += v;
	}
	
	public int getTotalFee()
	{
		return (this.fee+totpassengerfee);
	}
	
	public void setFee(int fee)
	{
		vehiclefee = fee;
		this.fee += fee;
	}
	
	public void setPassenger(int p, int fee)
	{
		sizePass = p;
		countPass += p;
		passengerfee = fee;
		totpassengerfee += p * fee;
	}
	
	public void setBicyclePassenger(int bicycles)
	{
		bicyclepassenger += bicycles;
	}
	
	
	
	
}
