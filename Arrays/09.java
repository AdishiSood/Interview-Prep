/*
Sort an array in one swap whose two elements are swapped

Input:  A[] = [3, 8, 6, 7, 5, 9] OR [3, 5, 6, 9, 8, 7] OR [3, 5, 7, 6, 8, 9]
 
Output: A[] = [3, 5, 6, 7, 8, 9]

*/

import java.util.Arrays;
 
class Main
{
    private static void sortArray(int[] arr)
    {
        int x = -1, y = -1;
        int prev = arr[0];
 
        // process each pair of adjacent elements
        for (int i = 1; i < arr.length; i++)
        {
            // if the previous element is greater than the current element
            if (prev > arr[i])
            {
                // first occurrence of conflict
                if (x == -1)
                {
                    x = i - 1;
                    y = i;
                }
                else {
                    // second occurrence of conflict
                    y = i;
                }
            }
            prev = arr[i];
        }
 
        // swap the elements at index `x` and `y`
        swap(arr, x, y);
    }
 
    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
 
    public static void main(String[] args)
    {
        int[] a = { 3, 5, 6, 9, 8, 7 };
 
        sortArray(a);
        System.out.println(Arrays.toString(a));
    }
}
