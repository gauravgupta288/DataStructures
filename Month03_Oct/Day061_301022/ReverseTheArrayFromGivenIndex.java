package Month03_Oct.Day061_301022;

import java.util.ArrayList;

public class ReverseTheArrayFromGivenIndex {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
        reverseTheArrayFromGivenIndex(list, 3);
    }

    static void reverseTheArrayFromGivenIndex(ArrayList<Integer> arr, int m){

        int end = arr.size() - 1;
        int start = m + 1;

        while (start < end){
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;end--;
        }
    }
}
