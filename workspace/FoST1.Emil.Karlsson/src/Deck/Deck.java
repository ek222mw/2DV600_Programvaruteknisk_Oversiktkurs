package Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Deck.Card.Rank;
import Deck.Card.Suite;

public class Deck {
	
	//private list cards.
	private List<Card> cards = new ArrayList<Card>(52);
	//card
	Card c = null;
	//Deck constructor
	public Deck()
	{
		//creates a deck with suite and rank values.
		for(Suite suite: Suite.values())
		{
			for(Rank rank : Rank.values())
			{
				cards.add(new Card(rank, suite));
			}
		}
		
	}
	
	
	//deals out next card.
	public Card handOutNextCard()
	{	//if cards stills exists then get top card and return it.
		if(cards.size() > 0)
		{
			c = cards.get(cards.size()-1);
			cards.remove(c);
			return c;
		}
		else
		{
			//prints out message
			System.out.println("No more cards! inputs new deck and shuffles and gives next card.");
			//init new deck.
			Deck deck = new Deck();
		  	//get cards to the list.
	        cards = deck.getCards();
	        //shuffle deck.
	        deck.shuffle();
	        //get next card
	        c = cards.get(cards.size()-1);
	        //then remove a card from the deck.
	        cards.remove(c);
	        
	       
		}
		return c;
		
	}
	//counts remaining cards in the deck.
	public int deckSize()
	{
		int remaining = cards.size();
		
		return remaining;
	}
	//returns cards.
	public List<Card> getCards() {
		
		
		return cards;
		
	}
	
		//shuffle method that put cards in deck in a random order every time.
		public void shuffle()
		{
			Card c;
			int index;
			Random randIndex = new Random();
			List<Card> temporary;
			
			//if not card size is 52 then init a new deck.
			if(cards.size() != 52)
			{
			Deck deck = new Deck();
	        cards = deck.getCards();
			}
			
			//randoms order of cards.
			for(int i=0; i<cards.size(); i++)
			{
				index = randIndex.nextInt(cards.size());
				
				c = cards.get(i);
				cards.set(i, cards.get(index));
				cards.set(index,c);
		
			}
			
			
		}

}
