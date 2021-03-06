package Exercise3;

import java.util.Arrays;

public class ArrayIntList extends AbstractIntCollection implements IntList {

	
	//add method.
	@Override
	public void add(int n) {
			//checks if length is less than or equal to size if true resize.
			if(values.length <= size)
			{
				resize();
			}
			//if length is greater then size then put in n in values and increase size.
			if(values.length > size)
			{
				values[size++] = n;
			}
			
		
		
		
	}
	//add at method.
	@Override
	public void addAt(int n, int index) {
		//if index less than length then go in.
		if(index < values.length)
		{		//if value is bigger or smaller then 0 then go in.
				if(values[index] > 0 || values[index] < 0)
				{	//if length less than size or equal then resize.
					if(values.length <= size)
					{
						resize();
						
					}
					//moves every element after index pos to the right.
					for(int i = size; i>index;i--)
					{
						values[i] = values[i-1];
					}
					
					
				}
			
				//put in index value at pos and add 1 to size.
				values[index] = n;
				size = size+1;
		}
		
	}
	//remove method.
	@Override
	public void remove(int index) {
		//if not equal to 0 then okey to remove.
		if(values[index] != 0)
		{
			
			//moves the index number to end of array
			System.arraycopy(values,index+1,values,index,values.length-1-index);
			//makes a new array with a 1 value shorter array.
			int[] tmpArr = new int[values.length-1];
			//cop values.
			System.arraycopy(values,0,tmpArr,0,values.length-1); 
			//overwrite old with temp array.
			values = tmpArr;
			//decrease size with 1.
			size =size-1;
			
			
		}
		
		
	
	}
	//get method
	@Override
	public int get(int index) {
		//return index value.
		return values[index];
	}
	//indexof method that searches through whole array if not found return -1 otherwise return index pos.
	@Override
	public int indexOf(int n) {
		for(int i= 0;i<values.length;i++)
		{
			if(values[i] == n)
			{
				return i;
			}
		}
		
		
		return -1;
	}

}
