package Month10_May.Day171_010523;

public class FlipZeroOne {
    public static void main(String[] args) {
        solve("11110000000");
    }

    static int[] solve(String A){
        int arr[] = new int[A.length()];

        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == '0'){
                arr[i] = 1;
            }else{
                arr[i] = -1;
            }
        }

        int maxSum = 0;
        int ans = 0;
        int curSum = 0;
        for(int i = 0; i < arr.length; i++){
            curSum += arr[i];
            maxSum = Math.max(curSum, maxSum);
            if(curSum < 0){
                curSum = 0;
            }
        }

        return new int[]{};
    }
}
