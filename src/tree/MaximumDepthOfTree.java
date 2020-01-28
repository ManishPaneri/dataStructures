package tree;

public class MaximumDepthOfTree {

    int findMaximumDepth(Node root){
        if(root==null){
            return 0;
        }
        if(root.left ==null && root.right== null){
            return 1;
        }

        if(root.left==null){
            return findMaximumDepth(root.right);
        }

        if(root.right==null){
            return findMaximumDepth(root.left);
        }

        return Math.max(findMaximumDepth(root.left), findMaximumDepth(root.right))+1;
    }
}
