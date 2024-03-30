import LinkedList.LinkedList;
import problems.*;

public class ProblemSolver {

    public static void main(String[] args){

        RemoveDupsFromLinkedList removeDups = new RemoveDupsFromLinkedList();
        ReturnNthElementFromLast returnNth = new ReturnNthElementFromLast();
        LinkedListPartition linkedListPartition = new LinkedListPartition();
        SumLinkedLists sum = new SumLinkedLists();
        LinkedListIntersection intersection = new LinkedListIntersection();

        LinkedList llA = new LinkedList();
        llA.addNode(3);
        llA.addNode(1);
        llA.addNode(5);
        llA.addNode(9);
        LinkedList llB = new LinkedList();
        llB.addNode(2);
        llB.addNode(4);
        llB.addNode(6);

        intersection.addSameNode(llA, llB, 7);
        intersection.addSameNode(llA, llB, 2);
        intersection.addSameNode(llA, llB, 1);


        System.out.println(intersection.findIntersection(llA, llB).value);


    }
}
