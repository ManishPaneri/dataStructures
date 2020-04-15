package tree;

public class IsCompleteBinaryTree {

    static boolean isComplete(Node root){
        if(root==null){
            return true;
        }

        if(root.right!=null && root.left==null){
            return false;
        }

        if(root.left!=null && root.right==null){
            return false;
        }

        return isComplete(root.left) && isComplete(root.right) ;
    }

    // main function
    public static void main(String[] args) {
        /* Construct below tree
		          1
		       /     \
		      2       3
		     / \     / \
		    4   5   6   7
		*/

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        if (isComplete(root)) {
            System.out.print("Given binary tree is a Complete Binary Tree");
        } else {
            System.out.print("Given binary tree is not a Complete Binary Tree");
        }
    }
}
