package Month10_May.Day189_270523;

public class FindAPick {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,3}));
    }

    static int solve(int A[]) {
        int start = 0;
        int end = A.length - 1;
        int mid = 0;

        while (start < end) {
            mid = start + (end - start) / 2;

            if(mid==0){
                return A[0] >= A[1] ? A[0] : A[1];
            }
            if (mid == end){
                return A[end - 1] >= A[end - 2] ? A[end - 1] : A[end - 2];
            }

            if (mid != 0 && mid < A.length - 1 && A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
                return A[mid];
            } else if (mid != 0 && A[mid] > A[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return A[start];
    }
}
