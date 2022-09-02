package gg.Month01_Aug.Day008_110822;

public class PrintPatternUsingRecusrion {
    public static void main(String[] args) {
        pattern2(5);
    }

    /**
     * 1 2 3
     * 1 2
     * 1
     * 1 2
     * 1 2 3
     *
     * @param n
     */
    static void pattern(int n) {

        if (n == 1) {
            System.out.println(" " + 1);
            return;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        pattern(n - 1);

        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    static void pattern2(int n) {

        if (n == 0) {
            //System.out.println(" *");
            return;
        }
        for (int i = 1; i < n; i++) {
            System.out.print(" ");
        }
        for (int i = 5; i >= n; i--) {
            System.out.print(" *");
        }
        System.out.println();

        pattern2(n-1);

        for (int i = 1; i < n; i++) {
            System.out.print(" ");
        }
        for (int i = 5; i >= n; i--) {
            System.out.print(" *");
        }
        System.out.println();
    }
}
