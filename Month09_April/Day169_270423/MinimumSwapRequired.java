package Month09_April.Day169_270423;

public class MinimumSwapRequired {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 17, 100, 11}, 20));
    }

    static int solve(int A[], int B){
        int desireNumber = 0;
        int ans = 0;

        for(int i : A){
            if(i <= B){
                desireNumber++;
            }
        }
        for(int i = 0; i < desireNumber; i++){
            if(A[i] > B){
                ans++;
            }
        }
        for(int i = 1; i < A.length - desireNumber + 1; i++){
            if(A[i-1] <= B){
                ans++;
            }
            if(A[i + desireNumber - 1] <= B){
                ans--;
            }
        }
        return ans;
    }
}
