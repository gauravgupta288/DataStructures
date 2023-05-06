package Month10_May.Day174_060523;

public class MaxAnd {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{34,66,40,80,36,66,61,95,93,35,37,88,26,80}));
    }

    static int solve(int A[]) {
        int ans = 0;

        for (int b = 30; b >= 0; b--) {
            int cnt = 0;

            for (int i = 0; i < A.length; i++) {
                cnt += (A[i] >> b) & 1;
            }

            if(cnt >= 2){
                ans = ans | (1 << b);
                for (int i = 0; i < A.length; i++) {
                    int num = (A[i] >> b) & 1;
                    if(num == 0){
                        A[i] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
