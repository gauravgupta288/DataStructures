package Month08_March.Day124_060323;

public class MinimumSwapsToGroupAll1 {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{0,1,1,1,0,0,1,1,0}));
    }

    static int solve(int A[]){
        int k = 0;
        int minCounts = 0;
        int badCount = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] == 1){
                k++;
            }
        }

        for(int i = 0; i < k; i++){
            if(A[i] == 0){
                badCount++;
            }
        }

        if(badCount == 0 ){
            return 0;
        }
        int start = 0;
        int ends = A.length - 1;
        int temp = k;
        while(start < ends){

            if(start == 0 && ends == A.length -1 ){
                if(A[start] == 0 || A[ends] == 0){
                    break;
                }
            }
            if((A[start] == 0 && A[ends] == 0) ){
                break;
            }
            if(A[start++] == 1){
                temp--;
            }
            if(A[ends--] == 1){
                temp--;
            }

            if(temp == 0){
                return 0;
            }
        }



        int s = 1;
        int end = k;

        int ans = k;
        while(s < A.length - k + 1){
            if(A[s - 1] == 0){
                badCount--;
            }
            if(A[end] == 0){
                badCount++;
            }
            ans = Math.min(ans, badCount);
            s++; end++;
        }

        return ans;
    }
}
