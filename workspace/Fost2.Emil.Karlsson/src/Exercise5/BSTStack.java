
package Exercise5;

import Exercise5.TreeWordSet.BST;

//interface describing BST object stack

public interface BSTStack extends Iterable<BST> {
	//Add bst at top of stack.
	public void push(BST n);
	
	//Returns and removes bst at top of stack.
	public BST pop();
	
	//Returns without removing bst at top of stack.
	public BST peek();
	
	//Number of bsts in stack.
	public int size();
	
	//Returns true if stack is empty.
	public boolean isEmpty();
	
	//returns a string.
	public String toString();
}
