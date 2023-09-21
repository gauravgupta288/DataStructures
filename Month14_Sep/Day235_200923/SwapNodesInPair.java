package Month14_Sep.Day235_200923;


class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class SwapNodesInPair {
    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {

        ListNode start = new ListNode(0);
        start.next = head;

        ListNode cur = start;

        while(cur.next != null && cur.next.next != null){

            cur.next = swap(cur.next, cur.next.next);

            cur = cur.next.next;

        }

        return start.next;
    }

    ListNode swap(ListNode a, ListNode b){
        a.next = b.next;
        b.next = a;

        return b;
    }
}
