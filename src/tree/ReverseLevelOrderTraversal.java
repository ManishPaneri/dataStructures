package tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseLevelOrderTraversal {

    // Function to print reverse level order traversal of given binary tree
    static void reverseLevelOrderTraversal(Node root){
        if (root == null) {
            return;
        }

        // create an empty queue and enqueue root node
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        // create a stack to reverse level order nodes
        Deque<Node> stack = new ArrayDeque<>();

        // pointer to store current node
        Node curr;

        // run till queue is not empty
        while (!queue.isEmpty()){
            // process each node in queue and enqueue their children
            curr = queue.poll();

            // push current node to stack
            stack.push(curr);

            // important - process right node before left node
            if (curr.right != null) {
                queue.add(curr.right);
            }

            if (curr.left != null) {
                queue.add(curr.left);
            }

        }

        // pop all nodes from the stack and print them
        while (!stack.isEmpty()) {
            System.out.print(stack.poll().data + " ");
        }

    }

    // main function
    public static void main(String[] args)
    {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        reverseLevelOrderTraversal(root);
    }
}
