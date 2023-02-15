package Month07_Feb.Day110_150223;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(solve(151));
    }

    public static int solve(long A) {

        for (int i = 2; i <= A / 2; i++) {
            if (A % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public int sqrt(long A) {
        int ans = 1;
        int i = 1;

        while (i * i <= A) {
            ans = i;
            i++;
        }
        return ans;
    }
}
