package gg.Month01_Aug.Day020_230822;

public class PeakElement {
    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{4, 1, 2, 3}, 4));
    }

    static int peakElement(int arr[], int n) {
        if (n == 1) return 0;
        int start = 0;
        int end = n - 1;
        if(arr[0]>arr[1])return 0;
        if(arr[n-1]>arr[n-2]) return n-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return -1;
    }
}
