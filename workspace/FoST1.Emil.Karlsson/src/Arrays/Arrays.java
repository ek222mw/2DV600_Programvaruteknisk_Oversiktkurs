package Arrays;

import java.util.ArrayList;

public class Arrays {
	
	public static void main(String[] args){
		
	}
	//sums all elements in array and returns sum.
	public static int sum(int[] arr){
	
		
		int sum = 0;
		
		for(int i = 0;i<arr.length; i++ )
		{
			sum+= arr[i];
		}
		
		
		
		return sum;
		
	}
	//returns a printable string.
	public static String toString(int[] arr){
		int[] newarr = arr;
		String out = "";
		for(int i = 0; i<newarr.length; i++)
		{
			out += "n = " + newarr[i]+ ", ";
		}
		return out;
		
		
		
		
	}
	
	//adds new value to all elements in array and returns.
	public static int[] addN(int[] arr, int n){
		
		int[] newarr = arr;
		for(int i = 0; i<newarr.length; i++)
		{
			newarr[i]= newarr[i] + n;
		}
		
		
		return newarr;
		
	}
	//Clones to new array and reverses order in it and returns.
	public static int[] reverse(int[] arr){
		
		int[] reversearr = arr.clone();
		
		for(int i= 0; i<reversearr.length / 2; i++)
		{
			int t = reversearr[i];
			reversearr[i] = reversearr[reversearr.length - i -1];
			reversearr[reversearr.length - i -1] = t;
		}
		
		return reversearr;
		
	}
	//loops through all value and replaces values that equals old with nw value.
	public static void replaceAll(int[] arr, int old, int nw){
		
		for(int i= 0;i<arr.length; i++)
		{
			if(arr[i] == old)
			{
				arr[i] = nw;
			}
		}
		
	}
	//clones and sorts to a new array and returns it.
	public static int[] sort(int[] arr){
		
		int[] sortarr = arr.clone();
		
		java.util.Arrays.sort(sortarr);
		
		
		return sortarr;
		
	}
	//returns true if array sub equals order in array arr else false.
	public static boolean hasSubsequence(int[] arr, int[] sub){
		
		
	    int subsequence = 0;
	    int index = 0;
	    boolean b = false;
	    
	    for(int i= 0; i<arr.length; i++)
	    {
	    	if(arr[i] == sub[index])
	    	{
	    	
	    		subsequence++;
	    		index++;
	    		if(sub.length == subsequence)
	    		{
	    			b = true;
	    			return b;
	    		}
	    	}
	    	else{
	    		index = 0;
	    	}
	    }
	    	 
	    return b;
	     
	 
				
				
		
		
		
		
	}
	//subtracts all arr1 elements with arr2 elements and returns a new array with the difference. if not same length on arr1 and arr2 throws exception. 
	public static int[] absDif(int[] arr1,int[] arr2){
		
		
		if(arr1.length != arr2.length)
		{
			try {
				throw new Exception("Not same length of the inputed arrays.");
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		int[] diff = new int[arr1.length];
		
		for(int i = 0; i<arr1.length; i++)
		{
			diff[i] = arr1[i] - arr2[i];
		}
		
		
		
		return diff;
		
	}
}
