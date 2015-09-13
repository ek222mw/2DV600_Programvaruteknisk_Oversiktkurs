package Diamond;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diamond {

	static int input;
	static Scanner scan;
	
	public static void main(String[] args)
	{
		try{
			
		
		//init scanner with keyboard input.
		scan = new Scanner(System.in);
		//scans next int.
		input = scan.nextInt();
		
		int mid, space, stars;
		//gets the middle of the input.
		mid = (input-1)/2;
		
			//for loop that writes a diamond, size is based on int input.
			for(int i = 0; i< input; i++)
			{
				//gets stars position for diamond figure.
				stars = input - 2 *(int)Math.abs(mid - i);
				//gets spaces position for diamond figure.
				space = (int)Math.abs(mid - i);
				//prints out with space in start.
				for(int k = 0; k < space; k++)
				{
					System.out.print(" ");
				}
				//prints out stars.
				for(int j = 0;  j < stars; j++)
				{
					System.out.print("*");
				}
				//prints out spaces after stars.
				for(int l = 0; l < space; l++)
				{
					System.out.print(" ");
				}
				
	
				//prints new line.
				System.out.print("\n");
				
			}
			
		//close scanner.
		scan.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}
	
	
}
