package gg.Day010_130822;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        subArray(new int[]{1,2,3,4}, 4, 0);
    }

    static ArrayList<Integer> subArray(int[] arr, int n, int s) {

        boolean flag = false;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;

            int j = i;
            while (sum < s && j < n) {
                sum += arr[j++];
                flag = true;
            }
            if (sum == s && flag) {//check flag if sum is zero and no sum is found in array.
                al.add(i + 1);
                al.add(j );
                return al;

            }
        }
        al.add(-1);
        return al;
    }
}
