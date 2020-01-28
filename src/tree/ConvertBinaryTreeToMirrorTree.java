package tree;

/*
Algorithm – Mirror(tree):
    (1)  Call Mirror for left-subtree    i.e., Mirror(left-subtree)
    (2)  Call Mirror for right-subtree  i.e., Mirror(right-subtree)
    (3)  Swap left and right subtrees.
            temp = left-subtree
            left-subtree = right-subtree
            right-subtree = temp
*/
public class ConvertBinaryTreeToMirrorTree {

    Node convertMirrorTree(Node root){
        if(root == null){
            return root;
        }

        /* do the subtrees */
        Node left = convertMirrorTree(root.left);
        Node right = convertMirrorTree(root.right);

        /* swap the left and right pointers */
        root.left = right;
        root.right = left;

        return root;
    }
}
