package Month08_March.Day124_060323;

public class MinimumSwaps {
    public static void main(String[] args) {
        System.out.println(minSwap(new int[]{1, 12, 10, 3, 14, 10, 5}, 8));
    }

    static int minSwap(int A[], int B){
        int k = 0;
        int minCounts = 0;
        int badCount = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] <= B){
                k++;
            }
        }

        for(int i = 0; i < k; i++){
            if(A[i] > B){
                badCount++;
            }
        }

        int s = 1;
        int end = k;

        int ans = badCount;
        while(s < A.length - k + 1){
            if(A[s - 1] > B){
                badCount--;
            }
            if(A[end] > B){
                badCount++;
            }
            ans = Math.min(ans, badCount);
            s++; end++;
        }

        return ans;

    }
}
