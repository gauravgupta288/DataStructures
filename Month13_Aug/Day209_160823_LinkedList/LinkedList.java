package Month13_Aug.Day209_160823_LinkedList;

class ListNode{
    ListNode next;
    int val;
}

public class LinkedList {
    public ListNode solve(ListNode A, int B) {
        if(B == 0){
            return A.next;
        }

        ListNode temp = A;
        int x = 0;

        while(x + 1 < B && temp.next != null){
            temp  = temp.next;
            x++;
        }
        temp.next = temp.next.next;
        return A;
    }
}
