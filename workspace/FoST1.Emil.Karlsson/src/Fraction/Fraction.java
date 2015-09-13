package Fraction;

public class Fraction {
	
	private int numerator;
	private int denominator;
	//Fraction constructor, throws exception if denominator is 0.
	Fraction(int n, int d)
	{
		if(d == 0)
		{
			try {
				throw new Exception("Error denominator can't be 0.");
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		numerator = n;
		denominator = d;
	}
	//get method for numerator.
	public int getNumerator()
	{
		return numerator;	
	}
	//get method for denominator.
	public int getDenominator()
	{
		return denominator;
	}
	//returns true if frac is negative else false.
	public boolean isNegative(Fraction frac)
	{
		double nd = (frac.getNumerator()/frac.getDenominator());
		if(nd < 0)
		{
			return true;
		}
		return false;
	}
	//add inputed values to denominator and numerator and returns the new value.
	public double add(int n, int d)
	{
		double numi = ((denominator * n) + (numerator * d));
		double deno = (denominator * d);
		
		return (numi/deno);
		
	}
	//subtracts inputed values to denominator and numerator and returns the new value.
	public double subtract(int n, int d)
	{
		
		double deno = (denominator * d);
		double numi = ((numerator * d) - (denominator * n));
		
		return (numi/deno);
		
	}
	//Multiplies inputed values to denominator and numerator and returns the new value.
	public double multiply(int n, int d)
	{
		double deno = denominator * d;
		double numi = numerator * n;
		
		return (numi/deno);
		
	}
	//divides inputed values to denominator and numerator and returns the new value.
	public double divide(int n, int d)
	{
		
		double deno = denominator * n;
		double numi = numerator * d;
		
		return (numi/deno);
		
	}
	//checks if the two Fractions objekts frac1 and frac2 has the same ND value. If true return true else false.
	public boolean isEqualTo(Fraction frac1, Fraction frac2)
	{
		double comp1 = (frac1.getNumerator() / frac1.getDenominator());
		double comp2 = (frac2.getNumerator() / frac2.getDenominator());
		if(comp1 == comp2)
		{
			return true;
		}
		
		
		
		return false;
		
	}
	// returns a printable string for ND number.
	public static String toString(double nd)
	{
		
		String NDstring = "The ND number is: "+ nd;
		
		return NDstring;
		
	}

}
