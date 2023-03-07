package Month08_March.Day125_070323;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }

    static int[][] solve(int A){
        int res[][] = new int[A][A];

        int i = 0;
        int j = 0;
        int n = 1;
        while(A > 1){
            for(int k = 0; k < A - 1; k++){
                res[i][j++] = n++;
            }

            for(int k = 0; k < A - 1; k++){
                res[i++][j] = n++;
            }

            for(int k = 0; k < A - 1; k++){
                res[i][j--] = n++;
            }

            for(int k = 0; k < A - 1; k++){
                res[i--][j] = n++;
            }
            i++;j++;A = A - 2;
        }
        if(A == 1){
            res[i][j] = n;
        }
        return res;
    }
}
