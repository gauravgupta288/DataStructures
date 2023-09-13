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

    public void insertAtPosition(int val, int pos){

        if(pos == 0){
            insertAtFirst(val);
            return;
        }
        if(size <= pos){
            insertAtLast(val);
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < pos - 1 && temp != null){
            temp = temp.next;
            i++;
        }

        Node x = new Node(val);
        x.next = temp.next;
        temp.next = x;

    }

    public int deleteFirst(){

        if(head == null){
            return -1;
        }

        int temp = head.val;
        head = head.next;
        size--;
        return temp;
    }

    public int deleteLast(){
        if(tail == null){
            return -1;
        }


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
