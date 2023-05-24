package Month10_May.Day187_240523;

public class CountSort {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,3,3,2,2,2}));
    }

    public static int[] solve(int[] A) {

        int max = 0;
        for(int i :A){
            max = Math.max(max, i);
        }
        int[] newArray = new int[max+1];

        for(int i = 0; i < A.length; i++){
            newArray[A[i]]++;
        }

        int k = 0;
        for(int i = 1; i < newArray.length; i++){
            for(int j = 0; j < newArray[i];j++){
                A[k++] = i;
            }
        }

        return A;
    }
}
