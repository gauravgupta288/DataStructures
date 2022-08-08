package gg.Day001_040822;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(summation(4));
    }

    /**
     * find factorial of a number using recursion
     *
     * @param num
     * @return
     */
    static int factorial(int num) {
        if (num == 1) return 1;

        return factorial(num - 1) * num;
    }

    static int summation(int n) {
        if (n == 0) return 0;

        return summation(n - 1) + n;
    }
}
