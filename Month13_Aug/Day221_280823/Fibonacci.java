package Month13_Aug.Day221_280823;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(-2/2);
    }

    static int fib(int n){
        if(n <= 1)
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
