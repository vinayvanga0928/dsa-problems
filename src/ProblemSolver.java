import LinkedList.LinkedList;
import problems.LinkedListPartition;
import problems.RemoveDupsFromLinkedList;
import problems.ReturnNthElementFromLast;

public class ProblemSolver {

    public static void main(String[] args){

        RemoveDupsFromLinkedList removeDups = new RemoveDupsFromLinkedList();
        ReturnNthElementFromLast returnNth = new ReturnNthElementFromLast();
        LinkedListPartition linkedListPartition = new LinkedListPartition();

        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.addNode(9);
        ll.addNode(5);
        ll.addNode(10);
        ll.addNode(2);

        ll.traverseLL();

        System.out.println(linkedListPartition.LinkedListPartition(ll, 4));

        ll.traverseLL();

    }
}
