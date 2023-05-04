package Month10_May.Day172_030523;

public class ModSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{794,924,452,548,78,475,836,924,426,421,548,115,480,926,519,45,464,116,356,111,79,732,309,817,880,12,119,207,433,1,947,202,95,90,468,620,996,692,178,700,311,848,742,782,933,586,7,671,872,235,92,383,637,952,507,360,705,684,618,303,334,876,500,104,491,866,966,863,498,581,554,244,223,679,892,166,877,246,699,595,794,567,282,6,862,528,936,19,64,796,212,24,714,725,749,620,862,37,90,876}));
    }
    static int solve(int A[]){
        int arr[] = new int[1001];
        int mod = 1000000007;
        int sum = 0;

        for(int i = 0; i < A.length; i++){
            arr[A[i]]++;
        }

        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++) {
                int cnt = i % j;
                int tmp = cnt * arr[i] * arr[j];
                sum = (tmp % mod) + (sum % mod) % mod;
            }
        }
        return sum % mod;
    }
}
