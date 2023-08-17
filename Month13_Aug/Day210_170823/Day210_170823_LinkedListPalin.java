package Month13_Aug.Day210_170823;

class ListNode{
    ListNode next;
    int val;
}

public class Day210_170823_LinkedListPalin {
    public boolean isPalindrome(ListNode A) {

        if(A == null){
            return false;
        }

        ListNode k = A;

        //Reach till middle of node

        ListNode slow = A;
        ListNode fast = A;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow);

        while(temp != null){

            if(temp.val != k.val){
                return false;
            }
            k = k.next;
            temp = temp.next;
        }

        return true;

    }

    public ListNode reverse(ListNode A){

        if(A == null || A.next == null){
            return A;
        }
        ListNode pre = null;
        ListNode cur = A;
        ListNode head = A;

        while(cur != null){
            head = cur.next;
            cur.next = pre;
            pre = cur;
            cur = head;
        }

        return pre;
    }
}
