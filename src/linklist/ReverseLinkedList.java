package linklist;

public class ReverseLinkedList {

    SingleLinkList reverse(SingleLinkList root){
        if(root == null){ return root;}

        SingleLinkList prev = null, next, current = root;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        root = prev;
        return root;
    }
}
