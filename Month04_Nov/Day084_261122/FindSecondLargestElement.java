package Month04_Nov.Day084_261122;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{10, 2, 3, 20, 10}));
    }

    static int secondLargest(int arr[]) {
        int max = arr[0];
        int smax = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                smax = max;
                max = arr[i];
            }else if(arr[i] > smax && max != arr[i]){
                smax = arr[i];
            }
        }
        return smax;

    }
}
