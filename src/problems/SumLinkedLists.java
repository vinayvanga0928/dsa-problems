package problems;

import LinkedList.LinkedList;
import LinkedList.Node;
public class SumLinkedLists {

    public LinkedList SumOfLinkedList(LinkedList lla, LinkedList llb){

        Node curr1 = lla.head;
        Node curr2 = llb.head;
        int carry = 0;
        LinkedList resultll = new LinkedList();

        while(curr1 != null || curr2 != null){
            int result = carry;
            if (curr1 != null) {
                result += curr1.value;
                curr1 = curr1.next;
            }
            if (curr2 != null) {
                result += curr2.value;
                curr2 = curr2.next;
            }
            resultll.addNode(result%10);
            carry = result/10;
        }
        return resultll;
    }
}
