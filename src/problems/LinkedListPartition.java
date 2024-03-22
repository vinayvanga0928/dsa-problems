package problems;

import LinkedList.LinkedList;
import LinkedList.Node;

public class LinkedListPartition {

    public Node LinkedListPartition(LinkedList ll, int num){

        Node curr = ll.head;
        ll.tail = ll.head;
        while(curr != null){
            Node next = curr.next;
            if (curr.value > num){
                ll.tail.next = curr;
                ll.tail = curr;
            } else {
                curr.next = ll.head;
                ll.head = curr;
            }
            curr = next;
        }
        ll.tail.next = null;
        return ll.head;
    }
}
