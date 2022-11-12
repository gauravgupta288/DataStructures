package Month04_Nov.Day070_091122;

class Node{
    int data;
    Node next;

    Node node;

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node insertAtFirst(Node node, int data){
        Node node1 = new Node(data);
        node1.next = node;

        node = node1;

        return node;

    }

    Node deleteAtPosition(Node node, int pos){
        Node temp = node;

        int count = 1;

        while(count != pos && temp!=null){
            temp = temp.next;
            count++;
        }
        if(temp.next.next != null){
            temp.next = temp.next.next;
        }else{
            temp.next = null;
        }

        return node;

    }

    void printLinkedList(Node node){
        Node temp = node;

        while (temp != null){
            System.out.println(temp.data);
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
}
public class LinkedList {
    public static void main(String[] args) {
        Node node = new Node(10);

        node = node.insertAtFirst(node, 20);
        node = node.insertAtFirst(node, 30);
        node = node.insertAtFirst(node, 40);
        node = node.insertAtFirst(node, 50);

        node.printLinkedList(node);

        node = node.deleteAtPosition(node, 0);
        node.printLinkedList(node);


    }
}
