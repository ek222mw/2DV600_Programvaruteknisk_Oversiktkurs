package LargestK;

import java.util.Scanner;

public class LargestK {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer number");
		
		int input = scanner.nextInt();
		int N = input;
		int K = 0;
		int total = 0;
		
		while(N < 1)
		{
			if(N < 1){
				System.out.println("N must be a positive number, try again");
				input = scanner.nextInt();
				
				N = input;
				
				
			}
		}
		
			
			while(N >= total + K +2)
			{
				K += 2;
				total += K;
			}
			
			System.out.println("N "+ N+", " + "K "+ K);
			
			scanner.close();
			
		
		
		
		
	}

}
