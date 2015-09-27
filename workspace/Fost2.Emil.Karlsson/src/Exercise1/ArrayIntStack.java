package Exercise1;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
	//add method
	@Override
	public void push(int n) {
		//if length less than size or equal then resize.
		if(values.length <= size)
		{
			resize();
		}
		//if length bigger than size then put in value and and increase size with 1.
		if(values.length > size)
		{
			values[size++] = n;
		}
		
			
		
	}
	//remove method.
	@Override
	public int pop() {
		  int arrsize = size -1;
		  int tmp = values[arrsize];
		  values[arrsize] = 0;
		  size =arrsize;
		  return tmp;
	}
	//peek method
	@Override
	public int peek() {
		//return the top of stack
		return values[size-1];
	}

}
