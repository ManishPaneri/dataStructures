package tree;

public class LowestCommonAncestorBT {

    static Node findLCA(Node node, int n1, int n2 ){
        // Base case
        if (node == null)
            return null;

        if (node.data == n1 || node.data == n2)
            return node;

        // Look for keys in left and right subtrees
        Node left_lca = findLCA(node.left, n1, n2);
        Node right_lca = findLCA(node.right, n1, n2);

        if (left_lca!= null && right_lca!= null)
            return node;

        // Otherwise check if left subtree or right subtree is LCA
        return (left_lca != null) ? left_lca : right_lca;
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("LCA(4, 5) = " +
                findLCA(root,4, 5).data);
        System.out.println("LCA(4, 6) = " +
                findLCA(root,4, 6).data);
        System.out.println("LCA(3, 4) = " +
                findLCA(root, 3, 4).data);
        System.out.println("LCA(2, 4) = " +
                findLCA(root,2, 4).data);
    }
}
