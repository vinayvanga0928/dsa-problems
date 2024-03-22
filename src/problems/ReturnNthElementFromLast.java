package problems;

import LinkedList.Node;

import java.util.HashMap;

public class ReturnNthElementFromLast {

    public int returnNthElementFromLast(Node head, int n){
        Node p1 = head;
        Node p2 = head;

        for(int i=0; i<n; i++){
            if(p2 != null){
                p2 = p2.next;
            }
        }
        while(p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.value;
    }
}
