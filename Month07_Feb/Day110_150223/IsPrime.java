package Month07_Feb.Day110_150223;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(solve(67010446483L));
    }

    public static int solve(long A) {

        //int sq = sqrt(A);
        for (long i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int sqrt(long A) {
        int ans = 1;
        int i = 1;

        while (i * i <= A) {
            ans = i;
            i++;
        }
        return ans;
    }
}
