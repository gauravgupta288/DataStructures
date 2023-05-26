package Month10_May.Day188_260523;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 2, 7, 7, 9}));
    }

    static int solve(int A[]) {
        int l = 0;
        int n = A.length;
        int r = n - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (mid != 0 && A[mid] == A[mid - 1]) {
                l = mid + 1;
            } else if (mid < n && A[mid] == A[mid + 1]) {
                r = mid;
            } else {
                return A[mid];
            }
        }

        return -1;
    }
}
