package LinkedList;

public class LinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createLL(int value){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    public void addNode(int value){
        if(head == null){
            createLL(value);
        } else {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = null;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void traverseLL(){
        Node currNode = head;
        for (int i=0; i<size; i++){
            System.out.print(currNode.value);
            currNode = currNode.next;
            if (i != size-1){
                System.out.print("->");
            }
        }
        System.out.println(" ");
    }
}
