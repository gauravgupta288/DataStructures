package Month04_Nov.Day069_081122;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 8, 0, 1, 2, 3}, 0));
    }

    static int search(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[start] && target < arr[mid]) {
                end = mid;
            } else if (target < arr[mid] && target < arr[end]) {
                start = mid + 1;
            }
        }
        return -1;

    }
}
