package Month04_Nov.Day063_011122;

public class KadaneAlgo {
    public static void main(String[] args) {
        System.out.println(kadaneAlgo(new int[]{5,4,-1,7,8}));
    }

    static int kadaneAlgo(int[] arr) {
        if(arr.length == 1) return arr[0];
        int maxSum = arr[0];
        int curSum = arr[0];

        for(int i =1;i< arr.length;i++){
            curSum = Math.max(curSum + arr[i], arr[i]);
            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }
}
