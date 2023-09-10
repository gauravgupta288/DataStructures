package Month14_Sep.Day229_090923;

public class RotateImage {
    public static void main(String[] args) {
        rotate(new int[][]{{5,1,9,11}, {2,4,8,10},{13,3,6,7}, {15,14,12,16}});
    }

    static void rotate(int[][] matrix) {
        int s = 0;


        int start = 0;
        for (int i = start; i < matrix.length - 2; i++) {
            int l = matrix.length - 1;
            int l1 = matrix.length - 1;
            for (int j = start; j < matrix.length - 1; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[l1][i];
                matrix[l1][i] = matrix[l][l1];
                matrix[l][l1] = matrix[j][l];
                matrix[j][l] = temp;
                l1--;
            }
            start++;
            l--;
        }
    }
}
