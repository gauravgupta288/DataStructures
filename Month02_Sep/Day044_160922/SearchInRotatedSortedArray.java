package gg.Month02_Sep.Day044_160922;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(searchInRotatedArray(new int[]{4,5,6,9,10,15,60,1,2,3}, 1));
    }

    static int searchInRotatedArray(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }
            //When you are in left sorted part
            if (arr[start] <= arr[mid]) {
                if (target < arr[start] || target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            //When you are in right sorted part
            else {
                if (target > arr[end] || target < arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


}
