/*
Selection sort is a sorting algorithm that selects the smallest element from an unsorted list in each iteration and places that element at the beginning of the unsorted list.
*/

// Selection sort in Java

import java.util.Arrays;
class Main
{
    // Utility function to swap values at two indices in the array
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
 
    // Function to perform selection sort on `arr[]`
    public static void selectionSort(int[] arr)
    {
        // run `n-1` times, where `n` is array length
        for (int i = 0; i < arr.length - 1; i++)
        {
            // find the minimum element in the unsorted subarray `[i…n-1]`
            // and swap it with `arr[i]`
            int min = i;
 
            for (int j = i + 1; j < arr.length; j++)
            {
                // if `arr[j]` is less, then it is the new minimum
                if (arr[j] < arr[min]) {
                    min = j;    // update the index of minimum element
                }
            }
            // swap the minimum element in subarray `arr[i…n-1]` with `arr[i]`
            swap(arr, min, i);
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 3, 5, 8, 4, 1, 9, -2 };
        selectionSort(arr);
        // print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
