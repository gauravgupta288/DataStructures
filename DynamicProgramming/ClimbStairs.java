package DynamicProgramming;

public class ClimbStairs {
    static int arr[];
    public static void main(String[] args) {
        arr = new int[4];

        System.out.println(solve(3));
    }

    public static int solve(int n){
        if(n <=1 ) return 1;

        if(arr[n] > 0) return arr[n];


        arr[n] = solve(n - 1) + solve(n - 2);

        return arr[n];
    }
}
