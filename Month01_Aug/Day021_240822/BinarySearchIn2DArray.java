package gg.Month01_Aug.Day021_240822;

public class BinarySearchIn2DArray {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 3));
    }

    static boolean binarySearch(int arr[][], int element) {

        int row = arr.length;
        int col = arr[0].length;

        int start = 0;
        int end = row * col - 1;

        int mid = start + (end-start)/2;
        while (start <= end) {

            int midElement = arr[mid / col][mid % col];

            if (midElement == element) {
                return true;
            } else if (midElement > element) {
                end = mid - 1;
            } else if (midElement < element) {
                start = mid + 1;
            }
            mid = start + (end-start)/2;
        }
        return false;
    }
}
