// A Linked List Node
class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
 
    Node() {}
}
 
class Main
{
    // Helper function to print a given linked list
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
 
    // Function takes a linked list and returns its complete copy
    public static Node copyList(Node head)
    {
        Node current = head;    // used to iterate over the original list
        Node newList = null;    // head of the new list
        Node tail = null;       // point to the last node in a new list
 
        while (current != null)
        {
            // special case for the first new node
            if (newList == null)
            {
                newList = new Node(current.data, null);
                tail = newList;
            }
            else {
                tail.next = new Node();
                tail = tail.next;
                tail.data = current.data;
                tail.next = null;
            }
            current = current.next;
        }
 
        return newList;
    }
 
    public static void main(String[] args)
    {
        // input keys
        int[] keys = {1, 2, 3, 4};
 
        // points to the head node of the linked list
        Node head = null;
 
        // construct a linked list
        for (int i = keys.length - 1; i >= 0; i--) {
            head = new Node(keys[i], head);
        }
 
        // copy linked list
        Node copy = copyList(head);
 
        // print duplicate linked list
        printList(copy);
    }
}
