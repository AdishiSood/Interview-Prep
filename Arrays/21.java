/*
Given an unsorted array of integers, sort the array into a wave like array. An array ‘arr[0..n-1]’ is sorted in wave form if arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
Examples: 
 

 Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
 Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} OR
                 {20, 5, 10, 2, 80, 6, 100, 3} OR
                 any other array that is in wave form

 Input:  arr[] = {20, 10, 8, 6, 4, 2}
 Output: arr[] = {20, 8, 10, 4, 6, 2} OR
                 {10, 8, 20, 2, 6, 4} OR
                 any other array that is in wave form

 Input:  arr[] = {2, 4, 6, 8, 10, 20}
 Output: arr[] = {4, 2, 8, 6, 20, 10} OR
                 any other array that is in wave form

 Input:  arr[] = {3, 6, 5, 10, 7, 20}
 Output: arr[] = {6, 3, 10, 5, 20, 7} OR
                 any other array that is in wave form
*/
// Java implementation of naive method for sorting
// an array in wave form.
import java.util.*;

class SortWave
{
	// A utility method to swap two numbers.
	void swap(int arr[], int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	// This function sorts arr[0..n-1] in wave form, i.e.,
	// arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4]..
	void sortInWave(int arr[], int n)
	{
		// Sort the input array
		Arrays.sort(arr);

		// Swap adjacent elements
		for (int i=0; i<n-1; i += 2)
			swap(arr, i, i+1);
	}

	// Driver method
	public static void main(String args[])
	{
		SortWave ob = new SortWave();
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
		int n = arr.length;
		ob.sortInWave(arr, n);
		for (int i : arr)
			System.out.print(i + " ");
	}
}
