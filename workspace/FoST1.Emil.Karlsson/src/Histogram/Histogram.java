package Histogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {
	//private fields.
	private static String one10 = "";
	private static String eleven20 ="";
	private static String twone30 = "";
	private static String ther140 ="";
	private static String fourty150 = "";
	private static String fifty160 = "";
	private static String sixty170 = "";
	private static String seventy180 ="";
	private static String eighty190 = "";
	private static String ninety1100 ="";
	private static String hundred1200 = "";
	private static int count1hundred = 0;
	private static int count101twohundred = 0;
	
	
	
	public static void main(String[] args)
	{
		//init path to file
		File file = new File("C:\\Users\\Emil\\Desktop\\int.txt");
		//arrarlist
		ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
		Scanner filescan;
		try {
			//scans file.
			filescan = new Scanner(file);
		
		int scannumber = 0;
		while(filescan.hasNext())
		{	//scans next integer.
			scannumber = filescan.nextInt();
			//sends integer to method for counting.
			CountNumber(scannumber);
		}
		//printout count of int between 1 and 100. Same for interval between 101 and 200. 
		//Then print all stars between every interval 11-20 and so on. 
		
		System.out.println("Number of integers in the interval [1,100]: "+count1hundred);
		System.out.println("in the interval [101,200]: "+count101twohundred);
		System.out.println("Histogram \n 1- 10 \t | \t"+one10+"\n"+
							"11- 20 \t | \t"+eleven20+"\n"+	
							"21- 30 \t | \t"+twone30+"\n"+
							"31- 40 \t | \t"+ther140+"\n"+
							"41- 50 \t | \t"+fourty150+"\n"+
							"51- 60 \t | \t"+fifty160+"\n"+
							"61- 70 \t | \t"+sixty170+"\n"+
							"71- 80 \t | \t"+seventy180+"\n"+
							"81- 90 \t | \t"+eighty190+"\n"+
							"91- 100  | \t"+ninety1100+"\n"+
							"101- 200 | \t"+hundred1200+"\n");
		//catches exception if file not exists and prints message.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void CountNumber(int n)
	{
		//counts if number is larger than 0 and less than 101
		if(n > 0 && n < 101)
		{
			count1hundred++;
		}//counts if number is larger than 100 and less than 201
		else if (n > 100 && n < 201)
		{
			count101twohundred++;
		}
		//if input bigger than 0 and less than 11 add a star.
		if(n > 0 && n < 11)
		{
			one10 += "*";
		}//if input bigger than 10 and less than 21 add a star.
		else if(n > 10 && n < 21)
		{
			eleven20 += "*";
		}//if input bigger than 20 and less than 31 add a star.
		else if(n > 20 && n < 31)
		{
			twone30 += "*";
		}//if input bigger than 30 and less than 41 add a star.
		else if(n > 30 && n < 41)
		{
			ther140 += "*";
		}//if input bigger than 40 and less than 51 add a star.
		else if(n > 40 && n < 51)
		{
			fourty150 += "*";
		}//if input bigger than 50 and less than 61 add a star.
		else if(n > 50 && n < 61)
		{
			fifty160 += "*";
		}//if input bigger than 60 and less than 71 add a star.
		else if(n > 60 && n < 71)
		{
			sixty170 += "*";
		}//if input bigger than 70 and less than 81 add a star.
		else if(n > 70 && n < 81)
		{
			seventy180 += "*";
		}//if input bigger than 80 and less than 91 add a star.
		else if(n > 80 && n < 91)
		{
			eighty190 += "*";
		}//if input bigger than 90 and less than 101 add a star.
		else if(n > 90 && n < 101)
		{
			ninety1100 += "*";
		}//if input bigger than 100 and less than 201 add a star.
		else if(n > 100 && n < 201)
		{
			hundred1200 += "*";
		}
		
		
	}

}
