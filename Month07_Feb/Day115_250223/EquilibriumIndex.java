package Month07_Feb.Day115_250223;

public class EquilibriumIndex {
    public static void main(String[] args) {
        System.out.println(equi(new int[]{-7, 1, 5, 2, -4, 3, 0}));
    }

    public static int equi(int[] A){
        int n = A.length;
        int lsum[] = new int[n];
        int rsum[] = new int[n];

        for(int i = 1; i < n; i++){
            lsum[i] = lsum[i - 1]  + A[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            rsum[i] = rsum[i + 1]  + A[i + 1];
        }

        for(int i = 0;i < n; i++){
            if(lsum[i] == rsum[i]){
                return i;
            }
        }

        return -1;
    }
}
