package gg.Day1_040822;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    /**
     * find factorial of a number using recursion
     *
     * @param num
     * @return
     */
    static int factorial(int num) {
        if (num == 0) return 1;
        int ans = factorial(num - 1);
        return ans * num;
    }
}
