package gg.Day021_240822;

import java.util.Arrays;
import java.util.HashMap;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        smallerThanItSelf(new int[]{8, 1, 2, 2, 3});
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
}
