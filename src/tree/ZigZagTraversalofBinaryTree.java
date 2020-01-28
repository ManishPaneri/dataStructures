package tree;

public class ZigZagTraversalofBinaryTree {

    public static void zigZagTraversal(Node node, Boolean flag){
        if(node == null){
            return;
        }

        System.out.print(node.data+" ");
        if(flag==true){
            zigZagTraversal(node.left,true);
            zigZagTraversal(node.right,true);
        }else {
            zigZagTraversal(node.right,false);
            zigZagTraversal(node.left,false);

        }

    }


    // Function to Print nodes from right to left
    static void Print_Level_Right_To_Left(Node root, int level)
    {
        if (root == null)
            return;

        if (level == 1)
            System.out.print(root.data + " ");

        else if (level > 1)
        {
            Print_Level_Right_To_Left(root.right, level - 1);
            Print_Level_Right_To_Left(root.left, level - 1);
        }
    }

    // Function to Print nodes from left to right
    static void Print_Level_Left_To_Right(Node root, int level)
    {
        if (root == null)
            return;

        if (level == 1)
            System.out.print(root.data + " ");

        else if (level > 1)
        {
            Print_Level_Left_To_Right(root.left, level - 1);
            Print_Level_Left_To_Right(root.right, level - 1);
        }
    }

    static int HeightOfTree(Node root)
    {
        if (root == null)
            return 0;

        // Compute the height of each subtree
        int lheight = HeightOfTree(root.left);
        int rheight = HeightOfTree(root.right);

        // Return the maximum of two
        return Math.max(lheight + 1, rheight + 1);
    }

    // Driver code
    public static void main(String args[])
    {
        /*
                   15
                /     \
              10      20
             / \     /  \
            8  12   16  25    */
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        zigZagTraversal(root, true);

    }
}


