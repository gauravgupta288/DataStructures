package Month08_March.Day138_200323;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 1, 2, 0, 1, 2}));
    }

    static int[] solve(int A[]){
        int s = 0;
        int e = A.length - 1;
        int p = 0;

        while (p <= e){
            if(A[p] == 0){
                int temp = A[p];
                A[p++] = A[s];
                A[s++] = temp;
            }else if(A[p] == 2){
                int temp = A[p];
                A[p] = A[e];
                A[e--] = temp;
            }else{
                p++;
            }
        }

        return A;
    }
}
