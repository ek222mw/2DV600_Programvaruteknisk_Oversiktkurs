package HighLow;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
	
	public static void main(String[] args)
	{
		try{
			//init scanner for input.
			Scanner scanner = new Scanner(System.in);
			System.out.println("Guess a number between 1 and 100");
			
			Random random = new Random();
			//Randoms a odd number.
			int number =  1 / 2 + random.nextInt((100 + 1) / 2 - 1 / 2);
			number = number * 2 + 1;
		
			int guesses = 0;
			
				
			
			while(guesses <12)
			{
				if(guesses > 10)
				{
					System.out.println("You don't have anymore guesses then 10, try again.");
					break;
				}
				//init input for int types.
				int input = scanner.nextInt();
				if(input > number)
				{
					System.out.println("Hint: lower");
					guesses++;
					
				}
				else if(input < number)
				{
					System.out.println("Hint: higher");
					guesses++;
					
				}
				else if(input == number)
				{
					guesses++;
					System.out.println("Guess correct, it took "+guesses+ " guesses to find the right number");
					
				}
				
			}
			guesses = 0;
			scanner.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
