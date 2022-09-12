package gg.Month02_Sep.Day040_120922;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{3,5,3,2,0}));
    }

    static int peakElement(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                }else if(arr[mid] > arr[mid - 1]){
                    start = mid + 1;
                }else{
                    end = mid ;
                }
            }

            return -1;
    }
}
