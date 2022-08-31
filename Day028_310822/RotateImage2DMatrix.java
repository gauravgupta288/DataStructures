package gg.Day028_310822;

public class RotateImage2DMatrix {
    public static void main(String[] args) {
        rotateBy90Degree(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}});
    }

    //TODO incomplete
    static void rotateBy90Degree(int[][] matrix){
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0,start = matrix.length-1;j<matrix[0].length;j++,start--){
                matrix[i][j] = matrix[start][i];
            }
        }
    }
}
