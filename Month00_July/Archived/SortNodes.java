package Month13_Aug.Day210_170823;


public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

 public class SortNodes {

     public static void main(String[] args) {
            ListNode list1 = new ListNode();
            list1.val = 1;
            list1.val = 2;
            list1 = list1.next;

            ListNode list2 = new ListNode(5);
            list2 = list2.next;
        }

         ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode list3 = new ListNode();

            while (list1 != null && list2 != null) {
                if (list1.val > list2.val) {
                    list3.val = list2.val;
//                    list3.next;
//                    list2.next;
                } else {
                    list3.val = list1.val;
//                    list3.next;
//                    list1.next;
                }
            }
            return list3;
        }
    }
