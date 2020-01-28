package tree;


/*

        1
       /   \
      2      3
     /  \
    4    5
  /
7

*/
public class PrintAncestorsNodeBinaryTree {

    boolean printAncestors(Node node, int target) {
        if(node == null){return false;}

        if (node.data == target)
            return true;

        if(printAncestors(node.left, target)||printAncestors(node.right,target)){
            System.out.print(node.data + " ");
        }
        return false;
    }
}
