package Month10_May.Day189_270523;

public class BinarySearcg {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,3,5,6}, 7));
    }

    static int solve(int A[], int B) {

        int start = 0;
        int end = A.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (A[mid] == B){
                return mid;
            }
            else if(A[mid] > B){
                end = mid + 1;
            }
            else {
                start = mid + 1;
            }
        }

        return start;

    }
}
