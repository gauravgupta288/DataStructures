package gg.Month02_Sep.Day044_160922;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(minElementInRotatedSortedArray(new int[]{3,4,5,6,1,2}));
    }

    static int findMinimum(int arr[]) {
        int min = arr[0];
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {
            return min;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[arr.length - 1]) {
                start = mid + 1;
            } else if (mid > 0 && arr[mid] > arr[mid - 1]) {
                end = mid - 1;
                min = Math.min(min, arr[mid - 1]);
            } else {
                min = Math.min(min, arr[start]);
                start = mid + 1;
            }
        }
        return min;
    }

    static int minElementInRotatedSortedArray(int arr[]) {
        int min = arr[0];
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {
            return min;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
}
