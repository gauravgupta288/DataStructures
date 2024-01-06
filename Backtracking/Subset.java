package Backtracking;

import java.util.ArrayList;

public class Subset {
    private  static ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        subset(new int[]{1,2,3}, new ArrayList<>(), 0);
        System.out.println();
    }

    public static void subset(int[] arr, ArrayList<Integer> arrayList, int n){
        if(n == arr.length){
            ans.add(arrayList);
            return;
        }

        for(int i = n; i < arr.length; i++){
            arrayList.add(arr[i]);
            subset(arr, arrayList, n + 1);
            arrayList.remove(arrayList.size() - 1);
        }

    }
}
