package tree;


/*
For example, the following tree

           10
        /      \
      -2        6
     /   \      /  \
    8     -4   7    5

should be changed to

    20(4-2+12+6)
        /      \
    4(8-4)      12(7+5)
     /   \      /  \
    0      0    0    0
*/
public class ConvertTreeToSumTree {


    int toSumTree(Node root){
        if(root == null){
            return 0;
        }
        int old_val = root.data;
        root.data = toSumTree(root.left) + toSumTree(root.right);
        return root.data + old_val;
    }
}

