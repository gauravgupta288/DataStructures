package gg.Month01_Aug.Day021_240822;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        smallerThanItself(new int[]{8, 1, 2, 2, 3});
    }

    static int[] smaller(int arr[]) {
        int res[] = new int[arr.length];

        int indexArray[] = new int[101];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            res[i] = count;
        }

        return res;
    }

    static int[] smallerThanItSelf(int arr[]) {
        int[] res = new int[arr.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int copy[] = arr.clone();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = map.get(copy[i]);
        }
        return res;
    }
    static int[] smallerThanItself(int nums[]){
        int[] count = new int[101];
        int[] res = new int[nums.length];

        for (int i =0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1 ; i <= 100; i++) {
            count[i] += count[i-1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = count[nums[i] - 1];
        }

        return res;
    }
}
