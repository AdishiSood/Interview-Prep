/*
How to implement it recursively? 
Recursive Bubble Sort has no performance/implementation advantages, but can be a good question to check one’s understanding of Bubble Sort and recursion.
If we take a closer look at Bubble Sort algorithm, we can notice that in first pass, we move largest element to end (Assuming sorting in increasing order). In second pass, we move second largest element to second last position and so on. 
Recursion Idea.  

Base Case: If array size is 1, return.
Do One Pass of normal Bubble Sort. This pass fixes last element of current subarray.
Recur for all elements except last of current subarray.
*/
// Java program for recursive implementation
// of Bubble sort

import java.util.Arrays;

public class GFG
{
	// A function to implement bubble sort
	static void bubbleSort(int arr[], int n)
	{
		// Base case
		if (n == 1)
			return;
	
		// One pass of bubble sort. After
		// this pass, the largest element
		// is moved (or bubbled) to end.
		for (int i=0; i<n-1; i++)
			if (arr[i] > arr[i+1])
			{
				// swap arr[i], arr[i+1]
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
	
		// Largest element is fixed,
		// recur for remaining array
		bubbleSort(arr, n-1);
	}
	
	// Driver Method
	public static void main(String[] args)
	{
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
	
		bubbleSort(arr, arr.length);
		
		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(arr));
	}
}
