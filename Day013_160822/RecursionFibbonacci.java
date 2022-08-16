package gg.Day013_160822;

public class RecursionFibbonacci {
    public static void main(String[] args) {
        fibbo(0, 150, 0, 1);
    }

    static int fibbo(int sum, int n, int i, int j) {

        if (sum > n) return n;

        sum = i + j;
        System.out.print(sum + " ");
        int temp = j;
        j = sum;
        i = temp;

        return fibbo(sum, n, i, j);
    }
}
