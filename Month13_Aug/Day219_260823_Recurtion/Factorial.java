package Month13_Aug.Day219_260823_Recurtion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(solve(6));
    }

    static int solve(int n){
        if(n == 1){
            return 1;
        }

        return n * solve(n - 1);
    }
}
