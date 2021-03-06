package Deck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Deck.Card.Rank;
import Deck.Card.Suite;

public class PlayCardsMain {
	
	
	public static void main(String[] args)
	{
			//init new deck
		  	Deck deck = new Deck();
		  	//get cards to the list.
	        List<Card> cards = deck.getCards();
	        System.out.println("Alternative 1: Shuffle \n"
	        					+ "Alternative 2: Deal Card \n"+
	        					"Alternative 3: Remaining Cards \n"+
	        					"Alternative 4: Exit"
	        					);
	        //init scan with keyboard input.
	        Scanner scan =  new Scanner(System.in);
	        //scan nextline.
	        String input = scan.nextLine();
	        boolean i = true;
	        while(i)
	        {
	        	 
	        switch(input)
	        {	//if input equals "1" then shuffle.
	        	case "1":
	        	{
	        		deck.shuffle();
	        		
	        		break;
	        	}//if equals "2" then deal next card.
	        	case "2":
	        	{
	        		Card playedcard = deck.handOutNextCard();
	     	        System.out.println("Dealt Card: "+playedcard.toString()+",");
	     	       
	     	        break;
	        	}//if equals "3" then get remaining card count in the deck.
	        	case "3":
	        	{
	        		int cardsremaining = deck.deckSize();
	     	        System.out.println("Cards remaining: "+cardsremaining);
	     	       
	     	        break;
	        	}//if equals "4" then exit program.
	        	case "4":
	        	{
	        		System.exit(0);
	        		
	        		break;
	        	}
	        	default:
	        	{
	        		break;
	        	}
	        	
	        	
	        }
	        //else next input.
	        input = scan.nextLine();
	        }
	       
	       
	}

}
