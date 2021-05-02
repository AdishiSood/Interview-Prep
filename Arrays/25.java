/*
Find the smallest missing element from a sorted array
Input:  A[] = [0, 1, 2, 6, 9, 11, 15]
Output: The smallest missing element is 3
 
 
Input:  A[] = [1, 2, 3, 4, 6, 9, 11, 15]
Output: The smallest missing element is 0
 
 
Input:  A[] = [0, 1, 2, 3, 4, 5, 6]
Output: The smallest missing element is 7
*/

class Main
{
    // Function to find the smallest missing element in a sorted
    // array of distinct non-negative integers
    public static int findSmallestMissing(int[] A, int left, int right)
    {
        // base condition
        if (left > right) {
            return left;
        }
 
        int mid = left + (right - left) / 2;
 
        // if the mid-index matches with its value, then the mismatch
        // lies on the right half
        if (A[mid] == mid) {
            return findSmallestMissing(A, mid + 1, right);
        }
        else {
            // mismatch lies on the left half
            return findSmallestMissing(A, left, mid - 1);
        }
    }
 
    public static void main(String[] args)
    {
        int[] A = { 0, 1, 2, 3, 4, 5, 6 };
 
        int left = 0, right = A.length - 1;
        System.out.println("The smallest missing element is "
                            + findSmallestMissing(A, left, right));
    }
}
