package Month08_March.Day131_130323;

public class SpecialIndex {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,1,6,4}));
    }

    static int solve(int A[]){
        int n = A.length;
        int []odd = new int[n];
        int []even = new int[n];
        int count = 0;

        odd[0] = 0;
        even[0] = A[0];
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                even[i] = even[i - 1] + A[i];
                odd[i] = odd[i - 1];
            }else{
                odd[i] = odd[i - 1] + A[i];
                even[i] = even[i - 1];
            }
        }

        for(int i = 0; i < n;i++){
            int k;
            int j;
            if(i == 0){
                k = odd[n - 1];
                j = even[n - 1] - even[i];
            }else{
                 k = even[i - 1] + odd[n - 1] - odd[i];
                 j = odd[i - 1] + even[n - 1] - even[i];
            }


            if(k == j){
                count++;
            }
        }


        return count;
    }
}
