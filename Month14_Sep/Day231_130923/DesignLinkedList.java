package Month14_Sep.Day231_130923;

public class DesignLinkedList {

    private Node head;
    private Node tail;

    int size;

    DesignLinkedList(){
        size = 0;
    }

    public int getSize(){
        return size;
    }
    public void insertAtFirst(int val){
        Node temp = new Node(val);

        size++;
        if(head == null){
            head = temp;
            tail = head;
            return;
        }

        temp.next = head;
        head = temp;
    }

    public void insertAtLast(int val){
        Node temp = new Node(val);

        size++;

        if(tail == null){
            tail = temp;
            head = tail;

            return;
        }

        tail.next = temp;
        tail = temp;

    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val + "-->");
            temp = temp.next;
        }

        System.out.println("Null");
    }
    public class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
