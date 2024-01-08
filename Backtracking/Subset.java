package Backtracking;

import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        subset(new int[]{1,2,3}, list, 0, ans);
        System.out.println();
    }

    public static void subset(int[] arr, ArrayList<Integer> arrayList, int n, ArrayList<ArrayList<Integer>> ans){
        if(n == arr.length){
            ans.add(new ArrayList<>(arrayList));
            return;
        }

            arrayList.add(arr[n]);
            subset(arr, arrayList, n + 1, ans);
            arrayList.remove(arrayList.size() - 1);
        subset(arr, arrayList, n + 1, ans);

        return;
    }
}
