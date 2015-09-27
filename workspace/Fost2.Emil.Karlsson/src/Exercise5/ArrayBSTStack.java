package Exercise5;

import Exercise5.TreeWordSet.BST;

public class ArrayBSTStack extends AbstractBSTCollection implements BSTStack {
	//add method
	@Override
	public void push(BST n) {
		//if length less than size or equal then resize.
		if(bst_vals.length <= size)
		{
			resize();
		}
		//if length bigger than size then put in value and and increase size with 1.
		if(bst_vals.length > size)
		{
			bst_vals[size++] = n;
		}
		
			
		
	}
	//remove method.
	@Override
	public BST pop() {
		  int arrsize = size -1;
		  //new bst and decrease size with 1
		  BST tmp = bst_vals[arrsize];
		  //sets size-1 to value null
		  bst_vals[arrsize] = null;
		  //decrease size with 1
		  size=arrsize;
		  //return tmp value.
		  return tmp;
	}
	//peek method
	@Override
	public BST peek() {
		//return the top of stack
		return bst_vals[size-1];
	}

}
