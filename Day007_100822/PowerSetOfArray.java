package gg.Day007_100822;

import java.util.ArrayList;

public class PowerSetOfArray {
    public static void main(String[] args) {
        helper(new int[]{1, 2, 3});
    }

    static void helper(int arr[]) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        powerSet(arr, arr1, list,0);
    }

    static void powerSet(int arr[], ArrayList<Integer> arr1,ArrayList<ArrayList<Integer>> list, int i) {

        if (i == arr.length) {

            list.add(arr1);
            for (ArrayList<Integer> l : list) {
                System.out.println(l);
            }
            return;
        }
        arr1.add(arr[i]);
        powerSet(arr, arr1,list, i+1);

        arr1.remove(i);
        powerSet(arr, arr1, list,i+1);
    }
}
