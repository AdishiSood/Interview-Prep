/*
Implement two stacks in an array

Create a data structure twoStacks that represents two stacks. 
Implementation of twoStacks should use only one array, i.e., both stacks should use the same array for storing elements.
Following functions must be supported by twoStacks.
push1(int x) –> pushes x to first stack 
push2(int x) –> pushes x to second stack
pop1() –> pops an element from first stack and return the popped element 
pop2() –> pops an element from second stack and return the popped element
Implementation of twoStack should be space efficient.


(Divide the space in two halves) 
A simple way to implement two stacks is to divide the array in two halves and assign the half half space to two stacks, i.e., 
use arr[0] to arr[n/2] for stack1, and arr[(n/2) + 1] to arr[n-1] for stack2 where arr[] is the array to be used to implement two stacks and size of array be n. 
The problem with this method is inefficient use of array space. A stack push operation may result in stack overflow even if there is space available in arr[]. 
For example, say the array size is 6 and we push 3 elements to stack1 and do not push anything to second stack2. When we push 4th element to stack1, 
there will be overflow even if we have space for 3 more elements in array.

*/

import java.util.*;
class twoStacks
{
int[] arr;
int size;
int top1, top2;

// Constructor
twoStacks(int n)
{
	size = n;
	arr = new int[n];
	top1 = n / 2 + 1;
	top2 = n / 2;
}

// Method to push an element x to stack1
void push1(int x)
{

	// There is at least one empty
	// space for new element
	if (top1 > 0)
	{
	top1--;
	arr[top1] = x;
	}
	else
	{
	System.out.print("Stack Overflow"
					+ " By element :" + x +"\n");
	return;
	}
}

// Method to push an element
// x to stack2
void push2(int x)
{

	// There is at least one empty
	// space for new element
	if (top2 < size - 1)
	{
	top2++;
	arr[top2] = x;
	}
	else
	{
	System.out.print("Stack Overflow"
					+ " By element :" + x +"\n");
	return;
	}
}

// Method to pop an element from first stack
int pop1()
{
	if (top1 <= size / 2)
	{
	int x = arr[top1];
	top1++;
	return x;
	}
	else
	{
	System.out.print("Stack UnderFlow");
	System.exit(1);
	}
	return 0;
}

// Method to pop an element
// from second stack
int pop2()
{
	if (top2 >= size / 2 + 1)
	{
	int x = arr[top2];
	top2--;
	return x;
	}
	else
	{
	System.out.print("Stack UnderFlow");
	System.exit(1);
	}
	return 1;
}
};
class GFG
{

/* Driver program to test twStacks class */
public static void main(String[] args)
{
	twoStacks ts = new twoStacks(5);
	ts.push1(5);
	ts.push2(10);
	ts.push2(15);
	ts.push1(11);
	ts.push2(7);
	System.out.print("Popped element from stack1 is "
					+ " : " + ts.pop1() +"\n");
	ts.push2(40);
	System.out.print("Popped element from stack2 is "
					+ ": " + ts.pop2()
					+"\n");
}
}
