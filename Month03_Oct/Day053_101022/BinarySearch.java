package gg.Month03_Oct.Day053_101022;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 5, 0));
    }

    static int binarySearch(int arr[], int n, int k) {

        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
