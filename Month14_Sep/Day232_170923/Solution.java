package Month14_Sep.Day232_170923;

class ListNode{
    ListNode next;
    int val;
}
public class Solution {
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }


        ListNode mid = getMiddle(head);

        ListNode h1 = head;
        ListNode h2 = mid.next;

        mid.next = null;

        ListNode x = sortList(h1);
        ListNode y = sortList(h2);

        return merge(x, y);

    }

    public ListNode getMiddle(ListNode A){

        ListNode slow = A;
        ListNode fast = A;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode A, ListNode B){
        if(A == null) return B;
        if(B == null) return A;

        ListNode head = null;
        ListNode temp = null;

        if(A.val <= B.val){
            head = A;
            A = A.next;
            temp = head;
        }else{
            head = B;
            B = B.next;
            temp = head;
        }

        while(A != null && B != null){
            if(A.val <= B.val){
                temp.next = A;
                A = A.next;
            }else{
                temp.next = B;
                B = B.next;
            }
            temp = temp.next;
        }

        if(A == null){
            temp.next = B;

        }else{
            temp.next = A;
        }

        return head;
    }
}
