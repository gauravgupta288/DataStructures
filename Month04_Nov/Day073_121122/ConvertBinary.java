package Month04_Nov.Day073_121122;

import java.util.ArrayList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class ConvertBinary {
    public static void main(String[] args) {

    }

    static int convertBinary(ListNode head){
        int res = 0;
        int len = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(head != null){


            list.add(head.val);
            head = head.next;
            len++;
        }
        System.out.println(len);
        for(int i : list){
            if(i == 1){
                res += pow(len-1);
            }
            len--;
        }

        return res;
    }
    static int pow(int n){
        int i = 0;
        int res = 1;
        while(i < n){
            res *= 2;
            i++;
        }

        return res;
    }
}
