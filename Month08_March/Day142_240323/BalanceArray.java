package Month08_March.Day142_240323;

public class BalanceArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 5, 2, 5, 8 }));
    }

    static int solve(int[] A) {
        int odd[] = new int[A.length];
        int even[] = new int[A.length];

        odd[0] = 0;
        even[0] = A[0];
        int count = 0;
        for(int i = 1; i < A.length; i++){
            if(i % 2 == 0){
                even[i] = even[i - 1] + A[i];
                odd[i] = odd[i  - 1];
            }else{
                even[i] = even[i  - 1];
                odd[i] = odd[i - 1] + A[i];
            }
        }

        for(int i = 0; i < A.length; i++){
            int oddSum = 0;
            int evenSum = 0;
            if(i == 0){
                oddSum = odd[A.length - 1] - odd[0];
                evenSum =  even[A.length - 1] - even[0];
            }else{
                oddSum = odd[i - 1] + even[A.length - 1] - even[i];
                evenSum =  even[i - 1] + odd[A.length - 1] - odd[i];
            }

            if(oddSum == evenSum){
                count++;
            }
        }

        return count;
    }
}
