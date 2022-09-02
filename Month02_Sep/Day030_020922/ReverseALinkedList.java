package gg.Month02_Sep.Day030_020922;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseALinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
                head = head.next;
        head.val = 20;
        head.next = null;
    }

    static ListNode reverse(ListNode head) {
        ListNode newHead = null;

        while(head != null){
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }

        return head;
    }
}
