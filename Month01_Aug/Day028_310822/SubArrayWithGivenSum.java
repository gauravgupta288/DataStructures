package gg.Month01_Aug.Day028_310822;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        subArray(new int[]{1,2,3,7,5,12}, 6, 24);

    }

    //TODO - incomplete logic
    static ArrayList<Integer> subArray(int[] arr, int n, int s) {
        int windowsSum = 0;
        int startIndex = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i<n) {
            if (windowsSum < s) {
                windowsSum += arr[i++];
            }
            if (windowsSum == s) {
                list.add(startIndex+1);
                list.add(i);
                break;
            }
            if(windowsSum > s){
                windowsSum -= arr[startIndex++];
                i--;
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        return list;
    }
}
