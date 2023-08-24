package Month13_Aug.Day217_240823;

public class KthElementInMatrix {
    public static void main(String[] args) {
        KthElementInMatrix k = new KthElementInMatrix();
        System.out.println(k.solve(new int[][]{{1,5,9}, {10,11,13}, {12,13,15}}, 8));
    }

    public int solve(int[][] a, int k) {

        int m = a.length;
        int n = a[0].length;
        int start = a[0][0];
        int end = a[n - 1][m - 1];

        while (start < end) {
            int mid = start + (end - start) / 2;
            int count = counter(a, mid);
            if (count < k) {
                start = mid + 1;

            } else {
                end = mid;
            }
        }

        return start;
    }

    public int counter(int[][] a, int target) {

        int count = 0;
        int row = a.length -1;
        int col = 0;

        while (row >= 0 && col < a.length) {
            if (a[row][col] <= target) {
                count += row + 1; // Count elements in the current column up to the row
                col++;
            } else {
                row--;
            }
        }

        return count;
    }
}
