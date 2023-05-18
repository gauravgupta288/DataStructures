package Month10_May.Day183_180523;

public class MergeSortedArray {
    public static void main(String[] args) {

    }
    public int[] solve(final int[] A, final int[] B) {

        int n = A.length;
        int m = B.length;

        int ans[] = new int[n + m];
        int i = 0;
        int k = 0;
        int j = 0;
        while(i < n && k < m){
            if(A[i] <= B[k]){
                ans[j] = A[i];
                i++;
            }else{
                ans[j] = B[k];
                k++;
            }
            j++;
        }

        while(i < n){
            ans[j] = A[i++];
            i++;
            j++;
        }

        while(k < m){
            ans[j] = B[k];
            j++;
            k++;
        }

        return ans;
    }
}
