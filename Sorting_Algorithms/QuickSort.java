/*
Quick sort is a highly efficient sorting algorithm and is based on partitioning of array of data into smaller arrays. 
A large array is partitioned into two arrays one of which holds values smaller than the specified value, say pivot,
based on which the partition is made and another array holds values greater than the pivot value.

Quicksort partitions an array and then calls itself recursively twice to sort the two resulting subarrays.
This algorithm is quite efficient for large-sized data sets as its average and worst-case complexity are O(n2), respectively.

## Quick Sort Algorithm
Using pivot algorithm recursively, we end up with smaller possible partitions. Each partition is then processed for quick sort. We define recursive algorithm for quicksort as follows −

Step 1 − Make the right-most index value pivot
Step 2 − partition the array using pivot value
Step 3 − quicksort left partition recursively
Step 4 − quicksort right partition recursively

*/
