package gg;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class AddList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l2 = l1.next;

        return l2;
    }

}
