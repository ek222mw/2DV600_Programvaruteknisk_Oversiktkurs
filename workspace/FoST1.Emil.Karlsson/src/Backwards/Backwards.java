package Backwards;

import java.util.Scanner;

public class Backwards {
	


	   public static void main(String[] args){
		   //creates scanner and keyboards as input.
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter a string");
		   
		   // inputs string and reverses it.
		   String input = scanner.nextLine();
		   String reverse = new StringBuilder(input).reverse().toString();
		   
		   //prints reverse string and closes scanner.
		   System.out.println(reverse);
		   scanner.close();
		   
		   
		   
		   
		   
	   }

}
