package Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Deck.Card.Rank;
import Deck.Card.Suite;

public class Deck {
	
	
	private List<Card> cards = new ArrayList<Card>(52);
	Card card = null;
	
	public Deck()
	{
		
		for(Suite suite: Suite.values())
		{
			for(Rank rank : Rank.values())
			{
				cards.add(new Card(rank, suite));
			}
		}
		
	}
	
	
	public void shuffle()
	{
		Card card;
		int index;
		Random randIndex = new Random();
		List<Card> temporary;
		
		
		if(cards.size() != 52)
		{
			if(cards.size() != 52)
			{
			Deck deck = new Deck();
	        cards = deck.getCards();
			}
			else{
				try {
					throw new Exception("Can't shuffle, not 52 cards in the deck.");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		for(int i=0; i<cards.size(); i++)
		{
			index = randIndex.nextInt(cards.size());
			
			card = cards.get(i);
			cards.set(i, cards.get(index));
			cards.set(index,card);
			
			
			
		}
		
		
	}
	
	public Card handOutNextCard()
	{	
		if(cards.size() > 0)
		{
			card = cards.get(cards.size()-1);
			cards.remove(card);
			return card;
		}
		return card;
		
	}
	
	public int deckSize()
	{
		int remaining = cards.size();
		
		return remaining;
	}

	public List<Card> getCards() {
		
		
		return cards;
		
	}

}
