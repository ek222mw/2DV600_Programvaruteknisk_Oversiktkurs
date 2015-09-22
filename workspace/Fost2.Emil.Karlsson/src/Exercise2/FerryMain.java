package Exercise2;

import java.util.Iterator;
import java.util.Scanner;

public class FerryMain {
	
	public static void main(String[] args)
	{	
		
		FerryClass fc = new FerryClass();
		
	
		boolean i = true;
		
		try{
			Scanner scan = new Scanner(System.in);
		while(i)
		{
			System.out.println("Press 1 to add vehicles or passengers \n"
					+"Press 2 to show used Space \n"
					+"Press 3 to show passenger count \n"
					+"Press 4 to show total money earned \n"
					+"Press 5 to show all vehicles");
			int input = scan.nextInt();
			switch(input)
			{
					
					
				
				case 1:
				{	
					System.out.println("Enter 1 to add car \n"
							+ "Enter 2 to add bus \n"
							+ "Enter 3 to add lorry \n"
							+ "Enter 4 to add bicycle \n"
							+ "Enter 5 to add passengers without vehicle");
					
					input = scan.nextInt();
					switch(input)
					{
						
						case 1:
						{
							System.out.println("Enter number of passengers");
							int passenger = scan.nextInt();
							Car c = new Car(passenger,fc.generateID());
							fc.embark(c);
							
							break;
							
						}
						case 2:
						{
							System.out.println("Enter number of passengers");
							int passenger = scan.nextInt();
							Bus b = new Bus(passenger,fc.generateID());
							fc.embark(b);
							
							break;
						}
						case 3:
						{
							System.out.println("Enter number of passengers");
							int passenger = scan.nextInt();
							Lorry l = new Lorry(passenger,fc.generateID());
							fc.embark(l);
							
							break;
						}
						case 4:
						{
							Bicycle b = new Bicycle(fc.generateID());
							fc.embark(b);
							
							break;
						}
						case 5:
						{
							System.out.println("Enter number of passengers");
							int passenger = scan.nextInt();
							Passenger p = new Passenger();
							p.addPassengers(passenger,p.fee);
							fc.embark(p);
							
							break;
						}
						default:
						{
							break;
						}
					}
				}
				break;
				case 2:
				{
					int count = fc.countVehicleSpace();
					System.out.println("Space: "+count+"\n");
					break;
				}
				case 3:
				{
					int passcount = fc.countPassengers();
					System.out.println("Passengers: "+passcount+"\n");
					break;
				}
				case 4:
				{
					int money = fc.countMoney();
					System.out.println("Money: "+money+"\n");
					break;
				}
				case 5:
				{
					Iterator it = fc.iterator();
					it = fc.vehiclelist.iterator();
					while (it.hasNext()) {
						String line = it.next().getClass().getName();
						String[] nwline = line.split("\\.");
						System.out.println("Vehicle: "+nwline[1]);
						
					}
					break;
				}
				default:
				{
					break;
				}
				
			}
			
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}	

}
