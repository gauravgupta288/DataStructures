package gg.Month03_Oct.Day054_111022;

import java.util.ArrayList;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(reverseArrayInGroups(list, 5, 3));
    }

    static ArrayList<Integer> reverseArrayInGroups(ArrayList<Integer> arr, int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        return list;
    }

    static ArrayList<Integer> swap(ArrayList<Integer> arr, int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();

        while (start<end){
            int temp = arr.get(start);
            arr.add(arr.get(start), arr.get(end));
        }

        return list;
    }
}
