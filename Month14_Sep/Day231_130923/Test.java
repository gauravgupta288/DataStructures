package Month14_Sep.Day231_130923;

public class Test {
    public static void main(String[] args) {
        DesignLinkedList ll = new DesignLinkedList();

        ll.insertAtLast(40);
        ll.insertAtFirst(10);
        ll.insertAtLast(50);
        ll.insertAtFirst(20);
        ll.insertAtFirst(30);
        ll.insertAtPosition(70, 4);

        ll.print();
        System.out.println(ll.deleteFirst());
        ll.print();
        System.out.println("Total size of list is : " + ll.getSize());
    }
}
