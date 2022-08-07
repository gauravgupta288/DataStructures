package gg.Day4_070822;

public class ReverseAnArrayUsingRecursion {
    static int[] arr;

    public static void main(String[] args) {
        arr = new int[]{1, 2, 3, 4, 5};
        reverseArray(0, arr.length - 1);
    }

    static void reverseArray(int i, int j) {

        if (i >= j) return;

        swap(i, j);
        reverseArray(i + 1, j-1);
    }

    static void swap(int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
