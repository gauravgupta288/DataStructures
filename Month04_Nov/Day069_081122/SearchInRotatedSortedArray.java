package Month04_Nov.Day069_081122;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 8, 0, 1, 2, 3}, 4));
    }

    static int search(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                if(target < arr[start] || target > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(target > arr[end] || target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;

    }
}
