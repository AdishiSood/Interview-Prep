class Node
{
  int data; // data used as key value
  Node child1;
  Node child2;
  Node child3;
  public Node()
  {
    data=0;
  }
  public Node(int d)
  {
    data=d;
  }
}

class Main
{
  public static void main(String ar[])
  {
    // create the root node
    Node root = new Node(0);
    root.child1 = new Node(1);   // create the 1st child
    root.child2 = new Node(2);   // create the 2nd child
    root.child3 = new Node(3);   // create the 3rd child

    System.out.println("Root node is " + root.data);
    System.out.println("child1 of Root node is " + root.child1.data);
    System.out.println("child2 of Root node is " + root.child2.data);
    System.out.println("child3 of Root node is " + root.child3.data);
  }
}
