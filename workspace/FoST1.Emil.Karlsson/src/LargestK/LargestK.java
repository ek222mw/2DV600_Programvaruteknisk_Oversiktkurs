package LargestK;

import java.util.Scanner;

public class LargestK {
	
	public static void main(String[] args){
		//init scanner with keyboard input.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer number");
		//scans next int.
		int input = scanner.nextInt();
		int N = input;
		int K = 0;
		int tot = 0;
			//if number less than 1, printout error message and try again.
			while(N < 1)
			{
				if(N < 1){
					System.out.println("N must be a positive number, try again");
					input = scanner.nextInt();
					
					N = input;
					
					
				}
			}
			
			//while n greater then total + k +2.
			while(N >= tot + K +2)
			{
				//add 2 to k every time
				K += 2;
				//overwrite k to total.
				tot += K;
			}
			//printout N and K.
			System.out.println("N "+ N+", " + "K "+ K);
			//close scanner.
			scanner.close();
	
		}

}
