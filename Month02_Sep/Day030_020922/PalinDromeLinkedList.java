package gg.Month02_Sep.Day030_020922;
class LinkedList{

}
public class PalinDromeLinkedList {
    public static void main(String[] args) {
        //Use slow and fast pointer to reach to middle and last;
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
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    ListNode reverse(ListNode head){
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
