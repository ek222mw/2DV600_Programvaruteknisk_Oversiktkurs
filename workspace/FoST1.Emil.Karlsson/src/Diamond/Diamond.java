package Diamond;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int mid, space, stars;
		
		mid = (input-1)/2;
		
		
		for(int i = 0; i< input; i++)
		{
			
			stars = input - 2 *(int)Math.abs(mid - i);
			space = (int)Math.abs(mid - i);
			
			for(int k = 0; k < space; k++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0;  j < stars; j++)
			{
				System.out.print("*");
			}
			
			for(int l = 0; l < space; l++)
			{
				System.out.print(" ");
			}
			

			
			System.out.print("\n");
			
		}
		
		
		scan.close();
		
	}
	
	
}