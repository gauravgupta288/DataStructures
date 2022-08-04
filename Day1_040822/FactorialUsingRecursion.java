package gg.Day1_040822;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(3));
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
}
