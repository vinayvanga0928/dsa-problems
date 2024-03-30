package problems;

import LinkedList.LinkedList;
import LinkedList.Node;

public class LinkedListIntersection {

    public void addSameNode(LinkedList lla, LinkedList llb, int value){
        Node node = new Node();
        node.value = value;
        node.next = null;
        lla.tail.next = llb.tail.next = node;
        lla.tail = llb.tail = node;
    }

    public Node findIntersection(LinkedList lla, LinkedList llb){

        if (lla.head == null || llb.head == null) return null;
        if (lla.tail != llb.tail) return null;

        Node shorter;
        Node longer;

        if (lla.size > llb.size) {
            shorter = llb.head;
            longer = lla.head;
        } else {
            shorter = lla.head;
            longer = llb.head;
        }

        longer = getKthNode(longer, Math.abs(lla.size - llb.size));

        while(shorter != null && longer != null && shorter != longer) {

            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }


    public Node getKthNode(Node head, int k){
        Node curr = head;
        while(k > 0 && curr != null){
            curr = curr.next;
            k--;
        }
        return curr;
    }
}
