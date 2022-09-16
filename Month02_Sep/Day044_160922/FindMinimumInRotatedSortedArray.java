package gg.Month02_Sep.Day044_160922;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMinimum(new int[]{3,1,2}));
    }

    static int findMinimum(int arr[]){
        int min = arr[0];
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[end] || arr[start] > arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            min = Math.min(min, arr[start]);
        }

        return min;
    }
}
