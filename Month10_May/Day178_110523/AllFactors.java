package Month10_May.Day178_110523;

public class AllFactors {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3,4,5}));
    }

    static int[] solve(int A[]){
        int len = A.length;
        int arr[] = new int[A[len -1]+1];


        for(int i = 1; i < arr.length; i++ ){
            for(int j = i; j < arr.length; j += i){
                arr[j] += 1;
            }
        }

        int ans[] = new int[len];

        for(int i = 0; i < len; i++){
            ans[i] = arr[A[i]];
        }

        return ans;
    }
}
