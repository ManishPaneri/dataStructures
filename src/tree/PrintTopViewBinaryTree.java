package tree;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PrintTopViewBinaryTree {

    static SortedMap<Integer,Node> s = new TreeMap<>();

    static void topViewBT(Node node, int count){
        if(node==null){
            return;
        }

        if(!s.containsKey(count)){
            s.put(count, node);
        }

        topViewBT(node.left, count-1);
        topViewBT(node.right, count+1);



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
        topViewBT(root, 0);

        for (Map.Entry mapElement : s.entrySet()) {
            Node node= (Node) mapElement.getValue();
            System.out.print(node.data+" ");
        }
    }
}
