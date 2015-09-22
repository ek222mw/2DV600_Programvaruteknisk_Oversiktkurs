package Fraction;

public class FractionMain {
	
	public static void main(String[] args)
	{
		Fraction frac = new Fraction(5,10);
		
		
		//Adding the send values to numerator and denominator and returns the new value and prints it.
		double add = frac.add(5,1);
		String addtoString = frac.toString(add);
		System.out.println("Adding result: "+addtoString);
		
		//subtracts the send values to numerator and denominator and returns the value and print it. 
		double subtract = frac.subtract(5,1);
		String subtoString = frac.toString(subtract);
		System.out.println("Subtract result: "+subtoString);
		
		//multiplies the send values with numerator and denominator and returns the value and prints it.
		double multiply = frac.multiply(5, 1);
		String multtoString = frac.toString(multiply);
		System.out.println("Multiply result: "+multtoString);
		
		//divides the send values with numerator and denominator and returns the value and prints it.
		double divide = frac.divide(5,2);
		String divtoString = frac.toString(divide);
		System.out.println("Divide result: "+divtoString);
		
		//check if the two instances has the same ND value, if same return true else false and prints it.
		boolean isequal = frac.isEqualTo(frac, new Fraction(5,2));
		System.out.println("Is Equal: "+isequal);
		
		//check if the send value has negative ND if true, return true else false and prints it.
		boolean isnegative = frac.isNegative(frac);
		System.out.println("Is negative: "+isnegative);
		
		
		
	}

}
