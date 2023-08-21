package Month13_Aug.Day214_210823;

public class NumberWithOneTwoThree {
    public static void main(String[] args) {
        solve(9);
    }

    public static int[] solve(int A) {

        if(A == 1){
            return new int[]{1};
        }

        int[] ans = new int[A];

        int k = 0;

        for(int i = 0; i < A; i++){
            int j = 1;
            while(j <= 3){
                ans[k++] = (i * 10) + j;
                j++;

                if(k == A){
                    break;
                }
            }
            if(k == A){
                break;
            }

        }

        return ans;
    }
}
