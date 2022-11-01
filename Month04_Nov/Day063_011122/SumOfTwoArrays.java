package Month04_Nov.Day063_011122;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        sum(new int[]{9,9,9}, 3, new int[]{9,9,9},3);
    }

    static int[] sum(int[] a, int n, int[] b, int m) {
        // Write your code here.
        int sum1 = 0;
        int sum2 = 0;
        int z = Math.max(n,m);


        for (int i : a) {
            sum1 = sum1 * 10 + i;
        }
        for (int i : b) {
            sum2 = sum2 * 10 + i;
        }
        int x = sum1 + sum2;
        String num = Integer.toString(x);
        int len = num.length();
        int[] res = new int[len];
        while (x != 0) {
            res[len-1] = x %  10;
            x /= 10;
            len--;
        }

        return res;
    }
}
