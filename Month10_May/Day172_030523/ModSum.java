package Month10_May.Day172_030523;

public class ModSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3}));
    }

    static int solve(int A[]){
        int arr[] = new int[1000];
        int mod = 1000000007;
        int sum = 0;

        for(int i = 0; i < A.length; i++){
            arr[A[i]]++;
        }

        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++) {
                if (arr[j] != 0 && i != 0) {
                    sum += (i % j) * arr[j] % mod;
                }
            }
        }
        return sum;
    }
}
