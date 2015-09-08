package CountDigits;

import java.util.Scanner;

public class CountDigits {
	
	 public static void main(String[] args){
		 
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter a number");
		 int input = scanner.nextInt();
		 int Even = 0;
		 int Odd = 0;
		 int Zero = 0;
		 int Sum = 0;
		 
		
	      int digit;

	    while(input <1)
	     {
	      if(input <1)
	      {
	    	  System.out.println("Must start on higher value then 0");
	    	  input = scanner.nextInt();
	      }
	     }
	      
	      input = Math.abs (input);
	      if (input == 0)
	         Zero++;

	      while (input != 0)
	      {
	         digit = input % 10;
	         Sum+= digit;
	         if (digit == 0)
	            Zero++;
	         else
	            if (digit%2 == 0)
	               Even++;
	            else
	               Odd++;

	         input = input / 10;
	      }
		 
		 System.out.println("Zeros: "+ Zero+ " "+ "Odd: "+ Odd+" "+"Even: "+Even+ " "+ "Sum: "+ Sum );
		 scanner.close();
		 
	 }
	 
	

}
