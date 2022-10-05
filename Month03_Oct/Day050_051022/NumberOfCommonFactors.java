package gg.Month03_Oct.Day050_051022;

public class NumberOfCommonFactors {
    public static void main(String[] args) {
        System.out.println(commonFactors(12, 6));
    }

    static int commonFactors(int a, int b) {
        int count = 1;

        int i = 2;
        int min = Math.min(a, b);
        while (i <= min) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}
