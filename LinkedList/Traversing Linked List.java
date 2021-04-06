/*

In many list-processing operations, we must process each node in the list in sequence; this is called traversing a list. 
To traverse a list in order, we must start at the list head and follow the list pointers till the last node.
The list can be traversed by using the assignment PTR:= LINK[PTR], which moves the pointer to the next node in the list. 
The algorithm for traversal can written as follows:

Algorithm: This algorithm traverses a list applying an operation print to each element of the list. 
1. PTR = START. 
2. While PTR ≠ NULL.
3.     Print INFO[PTR].
4.     PTR = LINK[PTR].
5. End
6. Exit

The algorithm starts with initializing PTR. Then process INFO[PTR], the information at the first node. 
Update PTR by the assignment PTR:=LINK[PTR], and then process INFO[PTR], 
the information at the second node and so on until PTR=NULL, which signals the end of the list.

*/
