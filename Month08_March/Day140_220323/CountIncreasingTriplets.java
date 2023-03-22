package Month08_March.Day140_220323;

public class CountIncreasingTriplets {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4,1,2,6,9,7}));
    }

    static int solve(int[] A) {
        int sum = 0;
        int max = A[0];
        int lside[] = new int[A.length];
        int rside[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for(int j = 0; j < i; j++){
                if(A[j] < A[i]){
                    count++;
                }
            }
            lside[i] = count;
        }

        for (int i = A.length -  1; i >= 0; i--) {
            int count = 0;
            for(int j = A.length -  1; j > i; j--){
                if(A[j] > A[i]){
                    count++;
                }
            }
            rside[i] = count;
        }

        for (int i = 0; i < A.length; i++) {
            sum += lside[i] * rside[i];
        }

        return sum;
    }
}
