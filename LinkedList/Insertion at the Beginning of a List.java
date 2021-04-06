/*
While inserting in the beginning, the new node will point to the first node of list, and then head will point to the new node.
So basically two pointers needs to be manipulated. So,

NEW[DATA] = INFO        // place the data in new node
NEW[NEXT] = HEAD    // link the next of new node to head
HEAD = NEW        // link the head to new node
*/
