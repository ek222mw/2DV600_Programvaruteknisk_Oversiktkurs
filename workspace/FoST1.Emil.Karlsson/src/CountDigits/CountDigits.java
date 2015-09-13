package CountDigits;

import java.util.Scanner;

public class CountDigits {
	
	 public static void main(String[] args){
		 //init scanner with keyboard input.
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a number");
		 //scanns next int.
		 int input = scanner.nextInt();
		 int Even = 0;
		 int Odd = 0;
		 int Zero = 0;
		 int Sum = 0;
		 
		
	      int digit;
	      //if inputed value starts below 1, print error message.
	    while(input <1)
	     {
	      if(input <1)
	      {
	    	  System.out.println("Must start on higher value then 0");
	    	  input = scanner.nextInt();
	      }
	     }
	      //get absolute value of input.
	      input = Math.abs (input);
	      if (input == 0)
	         Zero++;

	      while (input > 0)
	      {
	         digit = input % 10;
	         Sum+= digit;
	         //if digit divide able with 0 equals 0 then count zero.
	         if (digit == 0)
	            Zero++;
	         else
	        	 //if divide able with 2 count even.
	            if (digit%2 == 0)
	               Even++;
	            else
	            	//else count odd.
	               Odd++;
	         //divide input with 10.
	         input = input / 10;
	      }
		 //print all counters and close scanner.
		 System.out.println("Zeros: "+ Zero+ " "+ "Odd: "+ Odd+" "+"Even: "+Even+ " "+ "Sum: "+ Sum );
		 scanner.close();
		 
	 }
	 
	

}
