package Month10_May.Day179_120523;

public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        System.out.println(solve(5));
        System.out.println((int)Math.pow(2, 27) % 1000000007);
    }

    static int solve(int A) {
        int count = 0;


        for (int i = 1; i * i <= A; i++) {
            int t = A - ((i * (i - 1)) / 2);
            if (t % i == 0) {
                count++;
            }
        }

        return count;
    }
}
