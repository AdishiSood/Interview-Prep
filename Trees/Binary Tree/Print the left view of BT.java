/*
How to print the left view of a binary tree
Printing the left view of a binary tree involves printing the left-most node, at each level, in the binary tree.


Algorithm
This problem is solved by recursively traversing each level in the tree(visiting the left node before the right node). 
Whenever we move to the next level, print the leftmost node in that level (Note: we traverse the left subtree before the right subtree).
The variable maxlevel is used to track the maximum level in the tree that is traversed so far. 
Each time a node with a level greater than maxlevel is encountered, its value is printed, and the value of maxlevel is updated to that value.
*/
class Node { 
  int data; 
  Node left, right; 

  public Node(int item) 
  { 
    data = item; 
    left = right = null; 
  } 
} 
  
class BinaryTree { 
  Node root; 
  static int max_level = 0; 

  void leftViewUtil(Node node, int level) 
  { 
    if (node == null) 
      return; 

    if (max_level < level) { 
      System.out.print(" " + node.data); 
      max_level = level; 
    } 

    leftViewUtil(node.left, level + 1); 
    leftViewUtil(node.right, level + 1); 
  } 

  void leftView() 
  { 
      leftViewUtil(root, 1); 
  } 

  public static void main(String args[]) 
  { 
    /* creating a binary tree and entering the nodes */
    BinaryTree tree = new BinaryTree(); 
    tree.root = new Node(1); 
    tree.root.left = new Node(2); 
    tree.root.right = new Node(4); 
    tree.root.left.left = new Node(11); 
    tree.root.left.left.right = new Node(15); 
    tree.root.right.left = new Node(9); 
    tree.root.right.right = new Node(3);

    tree.leftView(); 
  } 
} 
