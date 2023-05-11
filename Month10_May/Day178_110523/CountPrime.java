package Month10_May.Day178_110523;

public class CountPrime {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    static int solve(int n){
        int arr[] = new int[n+1];
        int count = 0;

        for (int i = 2; i < arr.length; i++) {
            if(arr[i] == 0){
                for (int j = i * i; j < arr.length; j = j + i) {
                    arr[j] = 1;
                }
            }
        }
        for(int i = 2; i < n;i++){
            if(arr[i] == 0){
                count++;
            }
        }

        return count;
    }
}
