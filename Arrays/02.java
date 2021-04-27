/*
Find all distinct combinations of a given length – I
For example
Input:  {1, 2, 3}, k = 2
Output: {1, 2}, {1, 3}, {2, 3}
 
 
Input:  {1, 2, 1}, k = 2
Output: {1, 1}, {1, 2}
*/

class Main
{
    // Function to print all distinct combinations of length `k`
    public static void findCombinations(int[] A, String out, int i, int n, int k)
    {
        // invalid input
        if (k > n) {
            return;
        }
 
        // base case: combination size is `k`
        if (k == 0)
        {
            System.out.println(out);
            return;
        }
 
        // start from the next index till the last index
        for (int j = i; j < n; j++)
        {
            // add current element `A[j]` to the solution and recur for next index
            // `j+1` with one less element `k-1`
            findCombinations(A, out + " " + (A[j]) , j + 1, n, k - 1);
 
            // uncomment the following code to handle duplicates
 
            /* while (j < n - 1 && A[j] == A[j + 1]) {
                j++;
            } */
        }
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3 };
        int k = 2;
 
        /* If the array contains repeated elements, sort it to handle
           duplicate combinations */
 
        // Arrays.sort(A);
 
        // process elements from left to right
        findCombinations(A, "", 0, A.length, k);
    }
}
