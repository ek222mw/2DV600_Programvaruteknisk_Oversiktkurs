
package Exercise5;

import java.util.Iterator;

import Exercise5.TreeWordSet.BST;


public abstract class AbstractBSTCollection {
	//fields
	protected int size = 0;
	protected BST[] bst_vals = new BST[8];
	
	
	//return true if empty
	public boolean isEmpty() {
		return size==0;
	}
	
	//returns size.
	public int size() 
	{
		return size;
	}
	
	//returns a printable string.	
	public String toString() {
		StringBuffer strbuffer = new StringBuffer();
		strbuffer.append("[");
		for (int i=0;i<size;i++) {
			strbuffer.append(" "+bst_vals[i]);
		}

		strbuffer.append(" ]");
		return strbuffer.toString();
	}
	//constructor
	public BSTIterator iterator() {
		return new BSTIterator();
	}
	
	//resizes bst array.
	protected void  resize() {
		BST[] bst_tmp = new BST[2*bst_vals.length];
		System.arraycopy(bst_vals,0,bst_tmp,0,bst_vals.length); 
		bst_vals = bst_tmp;
	}
	//checks index.
	protected boolean checkIndex(int index, int upper){
		if (index < 0 || index >= upper) {
			String msg = "Index: "+index+", Upper: "+upper;
			System.err.println(msg);
			return false;
		}
		return true;
	}
	
	// bst iterator.
	class BSTIterator implements Iterator<BST> {
		//counter
		private int ct = 0;
		//returns next value.
		public BST next() 
		{
			return bst_vals[ct++];
		}
		//returns true as their is a next value.
		public boolean hasNext() 
		{
			return ct<size;
		}
		//remove, but not yet implemented.
		public void remove() {
			throw new RuntimeException("remove() is not yet created");
		}
	}
}
