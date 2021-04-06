/*

While inserting in the beginning, the new node will point to the first node of list, and then head will point to the new node.
So basically two pointers needs to be manipulated. So,

NEW[DATA] = INFO        // place the data in new node
NEW[NEXT] = HEAD    // link the next of new node to head
HEAD = NEW        // link the head to new node

While modifying these pointers care needs to be taken, that if these pointers are modified in wrong sequence, 
then it will destroy the list. If we write the above steps in following order: -

NEW[DATA] = INFO        // place the data in NEWnode
HEAD = NEW        // link the head to NEWnode
NEW[NEXT] = HEAD    // link the next of NEWnode to HEAD
In second step the pointer to existing list will be destroyed as now head is pointing to new node, 
so in 3rd step new[next] is actually pointing to itself. So, always change the pointers of new node first using existing information 
and then change the existing links to point to new node.

*/
