package Histogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Histogram {
	
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
		
		File file = new File("C:\\Users\\Emil\\Desktop\\int.txt");
		ArrayList<Integer> arrlist = new ArrayList<Integer>(); 
		Scanner filescan;
		try {
			filescan = new Scanner(file);
		
		int scannumber = 0;
		while(filescan.hasNext())
		{
			
			scannumber = filescan.nextInt();
			CountNumber(scannumber);
			
		
		
			
			
		}
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
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void CountNumber(int n)
	{
		if(n > 0 && n < 101)
		{
			count1hundred++;
		}
		else if (n > 100 && n < 201)
		{
			count101twohundred++;
		}
		
		if(n > 0 && n < 11)
		{
			one10 += "*";
		}
		else if(n > 10 && n < 21)
		{
			eleven20 += "*";
		}
		else if(n > 20 && n < 31)
		{
			twone30 += "*";
		}
		else if(n > 30 && n < 41)
		{
			ther140 += "*";
		}
		else if(n > 40 && n < 51)
		{
			fourty150 += "*";
		}
		else if(n > 50 && n < 61)
		{
			fifty160 += "*";
		}
		else if(n > 60 && n < 71)
		{
			sixty170 += "*";
		}
		else if(n > 70 && n < 81)
		{
			seventy180 += "*";
		}
		else if(n > 80 && n < 91)
		{
			eighty190 += "*";
		}
		else if(n > 90 && n < 101)
		{
			ninety1100 += "*";
		}
		else if(n > 100 && n < 201)
		{
			hundred1200 += "*";
		}
		
		
	}

}
