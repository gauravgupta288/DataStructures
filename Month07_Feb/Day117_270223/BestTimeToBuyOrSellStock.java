package Month07_Feb.Day117_270223;

public class BestTimeToBuyOrSellStock {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2}));
    }

    static int solve(final int[] A){
        int arr1[] = new int[A.length];
        int arr[] =  new int[A.length];
        int sum = 0;
        int min = A[0];
        int max = A[A.length -1];
        for(int i = 0; i < A.length; i++){
           min = Math.min(min, A[i]);
           arr[i] = min;
        }

        for(int i = A.length - 1; i >= 0; i--){
            max = Math.max(max, A[i]);
            arr1[i] = max;
        }

        max = arr1[0] - arr[0];
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr1[i] - arr[i]);
        }

        return max;

    }
}
