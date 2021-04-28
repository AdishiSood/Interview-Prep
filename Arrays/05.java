/*
Print all subarrays with 0 sum

Input:  { 4, 2, -3, -1, 0, 4 }
 
Subarrays with zero-sum are
 
{ -3, -1, 0, 4 }
{ 0 }
 
 
Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 
Subarrays with zero-sum are
 
{ 3, 4, -7 }
{ 4, -7, 3 }
{ -7, 3, 1, 3 }
{ 3, 1, -4 }
{ 3, 1, 3, 1, -4, -2, -2 }
{ 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
*/

class Main
{
    // Function to print all subarrays with a zero-sum
    // in a given array
    public static void printAllSubarrays(int[] A)
    {
        // consider all subarrays starting from `i`
        for (int i = 0; i < A.length; i++)
        {
            int sum = 0;
 
            // consider all subarrays ending at `j`
            for (int j = i; j < A.length; j++)
            {
                // sum of elements so far
                sum += A[j];
 
                // if the sum is seen before, we have found a subarray with zero-sum
                if (sum == 0) {
                    System.out.println("Subarray [" + i + "…" + j + "]");
                }
            }
        }
    }
 
    public static void main (String[] args)
    {
        int[] A = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
 
        printAllSubarrays(A);
    }
  
}
