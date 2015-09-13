package Deck;

public class Card {
	//enums with suite.
	public enum Suite{
		
		Hearts,Spades,Clubs,Diamond
	}
	//enums with rank
	public enum Rank{
		
		Deuce(2),Three(3),Four(4),Five(5),Six(6),Seven(7),Eigth(8),Nine(9),Ten(10),Jack(11),Queen(12),King(13),Ace(1);
		
		private int val;    
		  //Rank constructor
		  private Rank(int value) {
		    this.val = value;
		  }
		  //get method for value.
		  public int getValue() {
		    return val;
		  }
	}	
	//private constants.
	private final Suite suite;
	private final Rank  rank;
	//Card constructor.
	public Card(Rank rank, Suite suite)
	{
		this.suite = suite;
		this.rank = rank;
	}
	//get method for suite.
	public Suite getSuite()
	{
		return this.suite;
	}
	//get method for rank.
	public Rank getRank()
	{
		return this.rank;
	}
	//returns a printable string for rank and suite.
	public String toString()
	{
		return rank+ " of "+ suite;
	}
	
	
	
}
