package tree;

public class MinimumDepthOfTree {

    int findMinimumDepth(Node root){
        if(root==null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
            return findMinimumDepth(root.right);
        }

        if(root.right == null){
            return findMinimumDepth(root.left);
        }

        return Math.min(findMinimumDepth(root.left), findMinimumDepth(root.right))+1;
    }

}