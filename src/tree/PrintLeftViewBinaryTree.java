package tree;

import java.util.HashSet;

public class PrintLeftViewBinaryTree {

    static HashSet<Integer> s = new HashSet<>();

    static void leftViewBT(Node node, int level){
        if(node==null){
            return;
        }

        if(!s.contains(level)){
            s.add(level);
            System.out.print(node.data+" ");
        }

        leftViewBT(node.left,level+1);
        leftViewBT(node.right,level+1);

    }

    // Driver code
    public static void main(String args[])
    {
        /*
                   15
                /     \
              10      20
             / \     /  \
            8  12   16  25
                   /  \
                  30  35
         */
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        root.right.left.left = new Node(30);
        root.right.left.right = new Node(35);
        leftViewBT(root, 0);
    }
}
