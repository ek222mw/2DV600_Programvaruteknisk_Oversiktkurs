package Game123;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Game123.Card.Rank;
import Game123.Card.Suite;

public class Play123Main {

	//static list cards and deck
	static List<Card> cards;
	static Deck deck;
	 
	public static void main(String[] args)
	{	//init new deck and get cards.
		deck = new Deck();
        cards = deck.getCards();
        //shuffle the deck.
	    deck.shuffle();
	    int wins = 0;
	    int games = 0;
	    double percent = 0.0;
	    boolean j = true;
	    
	    //while games below 10000 count then play.
	    while(games <= 9999)
	    {
			if(games >= 10000)
	    	{
	    		j = false;
	    	}
    		if(j)
    		{	//if play method play123 returns true then count games and wins.
				if(Play123())
    			{
    				games++;
    				wins++;
    			}else // init new and get cards and shuffle it and count games.
    			{
    				deck = new Deck();
    		        cards = deck.getCards();
    		        deck.shuffle();
    				games++;
    			}
    		}
	    }
		//win percent operation.    	
	    percent = ((double)wins/ (double)games) * 100;
	    //transform to 0.00 printout form.
	    DecimalFormat df = new DecimalFormat("#.##");
	    //prints out games, wins and win %.
	    System.out.println("Games: "+games);
	    System.out.println("Wins: "+wins);
	    System.out.println("Win % is: "+df.format(percent));
	    
	}
	//method that returns true if go through whole deck without losing else returns false.
	public static boolean Play123()
	{
		int count = 0;
		
		// goes through the deck
		for(int k = 0; k<=52; k++ )
		{
			
			//for loop for counting 1,2,3,1,2,3
			for(int i =1;i<4;i++)
	    	{
			
				Card playedcard = deck.handOutNextCard();
				//if go through all cards without losing then return true = win.				
				if(count == 52)
				{
					return true;
				}
				// checks if count equals cards value if true = lose.
				if(playedcard.getEnumValue() == i )
				{
					count = 0;
					return false;
				}//counts card wins.
				else{
					count++;
				}	//resets counter to 1 from 3.
				if(i >3)
				{
					i = 1;
				}
	    	}
		}
	
		return true;
		
	}
	
}
