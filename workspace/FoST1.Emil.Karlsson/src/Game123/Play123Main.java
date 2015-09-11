package Game123;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Game123.Card.Rank;
import Game123.Card.Suite;

public class Play123Main {

	
	 static List<Card> cards;
	 static Deck deck;
	 
	public static void main(String[] args)
	{
		deck = new Deck();
        cards = deck.getCards();
        
        
	   // System.out.println("Dealt Card: "+playedcard.toString()+",");
	    deck.shuffle();
	    int wins = 0;
	    int games = 0;
	    int cardwin = 0;
	    double percent = 0.0;
	    boolean j = true;
  
		    while(games <= 9999)
		    {
		    
		
				if(games >= 10000)
		    	{
		    		j = false;
		    	}
	    		if(j)
	    		{
			
    				if(Play123())
	    			{
	    				games++;
	    				wins++;
	    			}else
	    			{
	    				deck = new Deck();
	    		        cards = deck.getCards();
	    		        deck.shuffle();
	    				games++;
	    			}
	    		}
		    }
		    	
	    percent = ((double)wins/ (double)games) * 100;
	    DecimalFormat df = new DecimalFormat("#.##");
	    System.out.println("Games: "+games);
	    System.out.println("Wins: "+wins);
	    System.out.println("Win % is: "+df.format(percent));
	    
	}
	
	public static boolean Play123()
	{
		int count = 0;
		
	
		for(int k = 0; k<=52; k++ )
		{
			
			
			for(int i =1;i<4;i++)
	    	{
				
				
				Card playedcard = deck.handOutNextCard();
				
				
				if(count == 52)
				{
					return true;
				}
			
				if(playedcard.getEnumValue() == i )
				{
					count = 0;
					return false;
				}
				else{
					count++;
				}	
				if(i >3)
				{
					i = 1;
				}
	    	}
		}
	
		return true;
		
	}
	
}
