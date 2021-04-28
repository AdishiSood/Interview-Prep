/*
Find maximum length subarray having a given sum

A[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 }
Sum = 8
 
 
Subarrays with sum 8 are
 
{ -5, 5, 3, 5 }
{ 3, 5 }
{ 5, 3 }
 
The longest subarray is { -5, 5, 3, 5 } having length 4
*/

class Main
{
    // Naive function to find the maximum length subarray with sum `S` present
    // in a given array
    public static void findMaxLenSubarray(int[] A, int S)
    {
        // `len` stores the maximum length of subarray with sum `S`
        int len = 0;
 
        // stores ending index of the maximum length subarray having sum `S`
        int ending_index = -1;
 
        // consider all subarrays starting from `i`
        for (int i = 0; i < A.length; i++)
        {
            int sum = 0;
 
            // consider all subarrays ending at `j`
            for (int j = i; j < A.length; j++)
            {
                // sum of elements in the current subarray
                sum += A[j];
 
                // if we have found a subarray with sum `S`
                if (sum == S)
                {
                    // update length and ending index of maximum length subarray
                    if (len < j - i + 1)
                    {
                        len = j - i + 1;
                        ending_index = j;
                    }
                }
            }
        }
 
        // print the subarray
        System.out.println("[" + (ending_index - len + 1)
                            + ", " + ending_index + "]");
    }
 
    public static void main (String[] args)
    {
        int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        int sum = 8;
 
        findMaxLenSubarray(A, sum);
    }
}
