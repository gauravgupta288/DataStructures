package gg.Month02_Sep.Day044_160922;

public class FindInMountainArray1095 {

    public static void main(String[] args) {
        System.out.println(findInMountain(new int[]{2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,1}, 1));
    }

    static int findInMountain(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int peak = findPeak(arr);
        int res = binarySearch(arr, target, start, peak);

        return res == -1 ? binarySearch2(arr, target, peak + 1, end) : res;

    }

    static int findPeak(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]){
                if(arr[mid] > arr[mid-1]) {
                    return mid;
                }else{
                    end = mid - 1;
                }
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarySearch(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int num = arr[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearch2(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
