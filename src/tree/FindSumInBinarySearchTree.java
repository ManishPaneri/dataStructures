package tree;

import java.util.ArrayList;
import java.util.HashSet;

public class FindSumInBinarySearchTree {

    /*private static ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list)
    {
        // Base Case
        if (node == null)
            return list;

        treeToList(node.left, list);
        list.add(node.data);
        treeToList(node.right, list);

        return list;
    }*/

    /*
     * O(n) time, O(nLogn) space
     */
    /*private  static boolean isPairPresent(Node node, int sum){
        ArrayList<Integer> tree_arr = new ArrayList<Integer>();
        treeToList(node, tree_arr);

        HashSet<Integer> tree_set = new HashSet<>();
        for(int index=0; index< tree_arr.size(); index++){
            int val = sum - tree_arr.get(index);
            if(tree_set.contains(val)){
                System.out.printf("Pair elements are %d and %d\n", tree_arr.get(index), val);
                return true;
            }
            tree_set.add(tree_arr.get(index));
        }
        return false;
    }*/


    /*
    * O(n) time, O(Logn) space
    * */
    private static  HashSet<Integer>  tree_set = new HashSet<>();
    private  static boolean isPairPresent(Node node, int sum){
        if(node == null){
            return false;
        }

        int val = sum - node.data;
        if (tree_set.contains(val)) {
            System.out.printf("Pair elements are %d and %d\n", node.data, val);
            return true;
        }
        tree_set.add(node.data);


        if(isPairPresent(node.left, sum)|| isPairPresent(node.right, sum)){
            return true;
        }
        return false;
    }


    // Driver function
    public static void main(String[] args)
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
        if(isPairPresent(root, 33)){
            System.out.println("pair present");
        }else{
            System.out.println("Not pair present");
        }
    }
}
