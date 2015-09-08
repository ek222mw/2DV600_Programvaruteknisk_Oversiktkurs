package Arrays;

public class ArraysMain {
	
	public static void main(String[] args){
		
		
		
		//array to be used in all methods to demonstrate each methods function.
		int[] arr = {1,2,3,4,5};
		
		//Sums all numbers in array.
		int sum = Arrays.sum(arr);
		System.out.println("Sum "+ sum);
		int [] reversearr = arr;
		
		// prints every number in array in a nice way.
		String toString = Arrays.toString(arr);
		System.out.println(toString);
		
		//The n value that will be added in all values in arr.
		int n = 1;
		//Adds N value to all elements in array.
		int[] addN = Arrays.addN(arr, n);
		
		//Prints the new value
		String addNToString = Arrays.toString(addN);
		System.out.println(addNToString);
		
		//Reverses the array and prints it out.
		int[] reverse = Arrays.reverse(reversearr);
		String reverseToString = Arrays.toString(reverse);
		System.out.println(reverseToString);
		
		//Replaces all values in arr that are equal to old value with value in nw. 
		int old = 15;
		int nw = 100;
		
		Arrays.replaceAll(arr, old, nw);
		//Prints replaced arr.
		toString = Arrays.toString(arr);
		System.out.println(toString);
		
		//Sorts arr and prints it out.
		int[] sorted = Arrays.sort(arr);
		toString = Arrays.toString(sorted);
		System.out.println(toString);
		
		//Checks if array is in subsequence then return true else false, and prints it.
		int sub[] = {3,4,5};
		boolean seq = Arrays.hasSubsequence(arr, sub);
		System.out.println(seq);
		
		//Calculates the difference between 2 arrays element values and returns a new array with difference, and prints it.
		int[] arr2 = {1,1,1,1,1};
		int[] diff = Arrays.absDif(arr, arr2);
		toString = Arrays.toString(diff);
		System.out.println(toString);
		
		
		
		
		
		
	}

}
