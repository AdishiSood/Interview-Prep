import java.util.Map;
import java.util.TreeMap;
 
// A class to store a binary tree node
class Node
{
    int key;
    Node left = null, right = null;
 
    Node(int key) {
        this.key = key;
    }
}
 
// A Pair class
class Pair<U, V>
{
    public final U first;       // first field of a pair
    public final V second;      // second field of a pair
 
    // Constructs a new Pair with specified values
    private Pair(U first, V second)
    {
        this.first = first;
        this.second = second;
    }
 
    // Factory method for creating a Typed Pair immutable instance
    public static <U, V> Pair <U, V> of(U a, V b)
    {
        // calls private constructor
        return new Pair<>(a, b);
    }
}
 
class Main
{
    // Recursive function to perform preorder traversal on the tree and fill the map.
    // Here, the node has `dist` horizontal distance from the tree's root,
    // and the level represents the node's level.
    public static void printTop(Node root, int dist, int level,
                                Map<Integer, Pair<Integer, Integer>> map)
    {
        // base case: empty tree
        if (root == null) {
            return;
        }
        // if the current level is less than the maximum level seen so far
        // for the same horizontal distance, or if the horizontal distance
        // is seen for the first time, update the map
        if (!map.containsKey(dist) || level < map.get(dist).second)
        {
            // update value and level for current distance
            map.put(dist, Pair.of(root.key, level));
        }
 
        // recur for the left subtree by decreasing horizontal distance and
        // increasing level by 1
        printTop(root.left, dist - 1, level + 1, map);
 
        // recur for the right subtree by increasing both level and
        // horizontal distance by 1
        printTop(root.right, dist + 1, level + 1, map);
    }
 
    // Function to print the top view of a given binary tree
    public static void printTop(Node root)
    {
        // create a `TreeMap` where
        // `key` —> relative horizontal distance of the node from the root node, and
        // `value` —> pair containing the node's value and its level
        Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
 
        // perform preorder traversal on the tree and fill the map
        printTop(root, 0, 0, map);
 
        // traverse the `TreeMap` and print the top view
        for (Pair<Integer, Integer> it: map.values()) {
            System.out.print(it.first + " ");
        }
    }
 
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        printTop(root);
    }
}
