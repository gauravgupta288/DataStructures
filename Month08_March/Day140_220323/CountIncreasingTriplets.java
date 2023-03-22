package Month08_March.Day140_220323;

public class CountIncreasingTriplets {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4,1,2,6,9,7,2}));
    }

    static int solve(int[] A) {
        int sum = 0;
        int max = A[0];
        int lside[] = new int[A.length];
        int rside[] = new int[A.length];

        for (int i = 1; i < A.length; i++) {
            if(A[i] > max){
                max = A[i];
                lside[i] = lside[i - 1] + 1;
            }else{
                lside[i] = lside[i - 1];
            }
        }

        for (int i = A.length - 2; i >= 0; i--) {
            if(A[i] > A[i + 1]){
                rside[i] = rside[i + 1] + 1;
            }else{
                rside[i] = rside[i + 1];
            }
        }

        return sum;
    }
}
