/*
K’th Smallest/Largest Element in Unsorted Array 

Given an array and a number k where k is smaller than size of array, we need to find the k’th smallest
element in the given array. It is given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15} 
k = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15} 
k = 4 
Output: 10 


A simple solution is to sort the given array using a O(N log N) sorting algorithm like Merge Sort,
Heap Sort, etc and return the element at index k-1 in the sorted array. 
Time Complexity of this solution is O(N Log N) 
*/
 // Java code for kth smallest element
// in an array
import java.util.Arrays;
import java.util.Collections;

class GFG {
	// Function to return k'th smallest
	// element in a given array
	public static int kthSmallest(Integer[] arr,
								int k)
	{
		// Sort the given array
		Arrays.sort(arr);

		// Return k'th element in
		// the sorted array
		return arr[k - 1];
	}

	// driver program
	public static void main(String[] args)
	{
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 };
		int k = 2;
		System.out.print("K'th smallest element is " + kthSmallest(arr, k));
	}
}

