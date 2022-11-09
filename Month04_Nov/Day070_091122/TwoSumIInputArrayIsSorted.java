package Month04_Nov.Day070_091122;

public class TwoSumIInputArrayIsSorted {
    public static void main(String[] args) {
        twoSum(new int[]{3,24,50,79,88,150,345}, 200);
    }

    static int[] twoSum(int[] arr, int target) {

        int res[] =  new int[2];
        for(int i = 0; i < arr.length; i++){
            int mid = binarySearch(i + 1, target - arr[i], arr);
            if(mid != -1){
                res[0] = i + 1;
                res[1] = mid + 1;
                return res;
            }
        }

        return res;
    }

    static int binarySearch(int start, int target, int[] arr) {
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
