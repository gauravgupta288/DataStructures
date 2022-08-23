package gg.Day020_230822;

public class PeakElement {
    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{4,1,2,3}, 4));
    }

    static int peakElement(int arr[], int n) {
        if (n == 1) return 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    return i;
                }
            } else if (i == n - 1) {
                if (arr[i] > arr[i - 1]){
                    return i;
                }
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    return i;
                }
            }
        }
        return -1;
    }
}
