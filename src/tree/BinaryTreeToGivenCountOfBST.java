package tree;

/*
Count the Number of Binary Search Trees present in a Binary Tree
Input :
    8
    /
   5
  / \
 4   6

Output : 4
*/

public class BinaryTreeToGivenCountOfBST {
    private  static int count =0;

    public static int NumberOfBST(Node root){
        // Base case
        if (root == null){
            count++;
            return 0;
        }

        if(root.left == null && root.right == null){
            count++;
            return root.data;
        }

        // Store information about the left subtree
        int min =  NumberOfBST(root.left);
        int max = NumberOfBST(root.right);

        if (root.data < max && root.data > min) {
            count++;
            return root.data;
        }
        return root.data;
    }

    // Driver code
    public static void main(String args[])
    {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        NumberOfBST(root);
        System.out.println("Count: " +count);

    }
}
