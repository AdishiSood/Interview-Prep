import java.util.Arrays;
 
class Main
{
    // Recursive function to perform insertion sort on subarray `arr[i…n]`
    public static void insertionSort(int[] arr, int i, int n)
    {
        int value = arr[i];
        int j = i;
 
        // find index `j` within the sorted subset `arr[0…i-1]`
        // where element `arr[i]` belongs
        while (j > 0 && arr[j - 1] > value)
        {
            arr[j] = arr[j - 1];
            j--;
        }
 
        arr[j] = value;
 
        // note that the subarray `arr[j…i-1]` is shifted to
        // the right by one position, i.e., `arr[j+1…i]`
 
        if (i + 1 <= n) {
            insertionSort(arr, i + 1, n);
        }
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 3, 8, 5, 4, 1, 9, -2 };
 
        // start from the second element (the element at index 0
        // is already sorted)
        insertionSort(arr, 1, arr.length - 1);
 
        // print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}

/*
OUTPUT: 
[-2, 1, 3, 4, 5, 8, 9]
*/

