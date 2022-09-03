package gg.Month02_Sep.Day030_020922;
class LinkedList{
    LinkedList next;
    int val;
    static LinkedList head;
    public static void insert(int data){
        LinkedList n = new LinkedList();
        n.val = data;
        n.next = null;

        if(head.next != null){

        }
    }
}

public class PalinDromeLinkedList {
    public static void main(String[] args) {
        //Use slow and fast pointer to reach to middle and last;
        ListNode head = new ListNode();
        ListNode slow = head;
        ListNode temp = head;
        ListNode fast = head;
        ListNode newHead = null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        fast = head;

        while(slow != null){
            if(fast.val != slow.val){
                System.out.println(false);
            }
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(true);
    }
    static ListNode reverse(ListNode head){
        ListNode newHead = null;
        while(head != null){
            ListNode next= head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
