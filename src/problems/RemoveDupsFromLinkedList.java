package problems;

import LinkedList.LinkedList;
import LinkedList.Node;
import java.util.HashSet;

public class RemoveDupsFromLinkedList {

    public Node removeDups(LinkedList ll){

        HashSet<Integer> set = new HashSet<>();
        Node prev = null;
        Node curr = ll.head;

        while(curr != null){
            if (set.contains(curr.value)){
                prev.next = curr.next;
                ll.size--;
            }else {
                set.add(curr.value);
                prev = curr;
            }
            curr = curr.next;
        }
        return ll.head;
    }
}
