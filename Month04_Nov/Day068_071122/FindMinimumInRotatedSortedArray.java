package Month04_Nov.Day068_071122;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

    }

    static int findMinimum(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }

        return arr[start];
    }
}
