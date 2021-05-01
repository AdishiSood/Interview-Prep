
/*
Maximum Product Subarray Problem
 
Input:  { -6, 4, -5, 8, -10, 0, 8 }
 
Output: The maximum product subarray is {4, -5, 8, -10} having product 1600
 
 
Input:  { 40, 0, -20, -10 }
 
Output: The maximum product subarray is {-20, -10} having product 200
*/

class Main
{
    // Function to return the maximum product of a subarray of a given array
    public static int findMaxProduct(int[] A)
    {
        // maintain two variables to store the maximum and minimum product
        // ending at the current index
        int max_ending = 0, min_ending = 0;
 
        // to store the maximum product subarray found so far
        int max_so_far = 0;
 
        // traverse the given array
        for (int i: A)
        {
            int temp = max_ending;
 
            // update the maximum product ending at the current index
            max_ending = Integer.max(i, Integer.max(i * max_ending, i * min_ending));
 
            // update the minimum product ending at the current index
            min_ending = Integer.min(i, Integer.min(i * temp, i * min_ending));
 
            max_so_far = Integer.max(max_so_far, max_ending);
        }
 
        // return maximum product
        return max_so_far;
    }
 
    public static void main(String[] args)
    {
        int[] A = { -6, 4, -5, 8, -10, 0, 8 };
 
        System.out.print("The maximum product of a subarray is " + findMaxProduct(A));
    }
}
