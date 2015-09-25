package Exercise5;

import java.util.Iterator;

public class HashWordSet implements WordSet {

	private int size;
	private Node[] buckets = new Node[3];
	
	
	@Override
	public Iterator iterator() {
		
		
		return new SetIterator();
	}

	@Override
	public void add(Word word) {
		
		int position = getBckNbr(word);  
		Node node = buckets[position];
		
		while (node != null) {
			if (node.val.equals(word))   					
				return;
			else 
				node = node.next;
		}
		node = new Node(word);
		node.next = buckets[position];
		buckets[position] = node;
		size++;
		
		if (size == buckets.length)
			rehash();
		
	}
	
	private class Node {
		Word val;
		Node next = null;
		
		public Node (Word w)
		{ 
			val = w;
		}
		
		public String toString()
		{
			return val.toString();
		}		
	}
	
	private class SetIterator implements Iterator<Word> {
		
		Word[] words;
		
		int position = 0;
		public SetIterator() {
			
			words = new Word[size];
			int number = 0;
			for (int i=0;i<buckets.length;i++) {
				Node node = buckets[i];
				while (node != null) {
					words[number++] = node.val;
					node = node.next;
				}
			}
		}

		
		public boolean hasNext() {			
			return position < words.length;
		}
		
		public Word next() {
			return words[position++];
		}
	}
	private void rehash() {
		size = 0;
		Node[] tmp = buckets; 
		buckets = new Node[2*tmp.length];  
		
		for (Node node : tmp) {   
			if (node == null) continue;
			while (node != null) {
				add(node.val);
				node = node.next;
			}
		}
	}
	
	private int getBckNbr(Word w) {
		int hash = w.hashCode();
		if (hash < 0)
			hash = -hash;
		return hash % buckets.length;	
	}

	@Override
	public boolean contains(Word word) {
		int position = getBckNbr(word);
		Node node = buckets[position];
		
		while (node != null) {
			if (node.val.equals(word))   					
				return true;
			else 
				node = node.next;
		}
		
		return false;
	}

	@Override
	public int size() {
	
		return size;
	}

}
