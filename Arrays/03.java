/*

You are given a list of n-1 integers and these integers are in the range of 1 to n. There are no duplicates in the list. 
One of the integers is missing in the list. Write an efficient code to find the missing integer.


Approach: The length of the array is n-1. So the sum of all n elements, i.e sum of numbers from 1 to n can be
calculated using the formula n*(n+1)/2. Now find the sum of all the elements in the array and subtract it from 
the sum of first n natural numbers, it will be the value of the missing element.

Algorithm: 
Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
Create a variable sum to store the sum of array elements.
Traverse the array from start to end.
Update the value of sum as sum = sum + array[i]
Print the missing number as sumtotal – sum
*/
// Java program to find missing Number
import java.util.Arrays;
import java.util.*;
class GFG{
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]);
			if (nums[index - 1] > 0) {
				nums[index - 1] *= -1;
			}
		}
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				res.add(i + 1);
			}
		}
		return res;
	}
	public static void main(String[] args) {
	int [] a ={1,2,2,3,1};
	System.out.println(findDisappearedNumbers(a));
	}
}

/*
Complexity Analysis: 
Time Complexity: O(n). 
Only one traversal of the array is needed.
Space Complexity: O(1). 
No extra space is needed
*/
