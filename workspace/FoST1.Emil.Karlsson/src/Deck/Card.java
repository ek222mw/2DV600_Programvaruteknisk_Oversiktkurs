package Deck;

public class Card {

	public enum Suite{
		
		Hearts,Spades,Clubs,Diamond
	}
	
	public enum Rank{
		
		Deuce(2),Three(3),Four(4),Five(5),Six(6),Seven(7),Eigth(8),Nine(9),Ten(10),Jack(11),Queen(12),King(13),Ace(1);
		
		private int value;    

		  private Rank(int value) {
		    this.value = value;
		  }

		  public int getValue() {
		    return value;
		  }
	}	
	
	private final Suite suite;
	private final Rank  rank;
	
	public Card(Rank rank, Suite suite)
	{
		this.suite = suite;
		this.rank = rank;
	}
	
	public Suite getSuite()
	{
		return this.suite;
	}
	
	public Rank getRank()
	{
		return this.rank;
	}
	
	public String toString()
	{
		return rank+ " of "+ suite;
	}
	
	
	
}
