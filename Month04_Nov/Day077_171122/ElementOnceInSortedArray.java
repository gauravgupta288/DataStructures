package Month04_Nov.Day077_171122;

public class ElementOnceInSortedArray {
    public static void main(String[] args) {
        System.out.println(elementOnceInSortedArray(new int[]{1, 2, 2, 3, 3}, 5));
    }

    static int elementOnceInSortedArray(int arr[], int n) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if((mid % 2 ==0) && (arr[mid] == arr[mid + 1]) || (mid %2 !=0 && arr[mid] == arr[mid - 1]) ){
                    start = mid + 1;
            }else{
                    end = mid;
            }
        }
        return arr[start];
    }
}
