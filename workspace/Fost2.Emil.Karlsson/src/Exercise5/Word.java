package Exercise5;

public class Word implements Comparable {
	//fields.
	private String word;
	Word w;
	//constructor with String arg.
	public Word(String str) { 
		word = str;
	}
	
	public static void main(String[] args)
	{
		//creates the words.
		Word w = new Word("hello");
		Word w2 = new Word("Hello");
		//prints the word.
		System.out.println("instance w1: "+w.toString());
		System.out.println("instance w2: "+w2.toString());
		//prints the two words are equal.
		System.out.println("Equal: "+w.equals(w2));
		//compares if w2 has same length,larger then 0 then w2 is larger then w1 and so on.
		System.out.println("Compare diff length: "+w.compareTo(w2));
		
	}
	//returns word toString.
	@Override
	public String toString() {
		return word; 
	}
	//returns hashvalue for word.
	@Override
	public int hashCode() {
		//return word.hashCode();
		int hashc = 0;
		for ( int i=0;i<word.length();i++) {
		char ch = word.charAt(i);
		hashc += Character.getNumericValue(ch);
		}
		return hashc;

	}
	//checks if words are equal then return true else false. etc. hello = HELLO is same.
	@Override
	public boolean equals(Object other) {
		
		if(other instanceof Word)
		{
			Word otherWord = (Word)other;
			return word.equalsIgnoreCase(otherWord.word);
		}
		
		
		return false; 
		
		
	}
	//returns diff in length of words. 0 if equal.
	@Override
	public int compareTo(Object w) {
		
		return w.toString().toLowerCase().compareTo(this.word.toLowerCase());
			
	}
	
	
}
	
