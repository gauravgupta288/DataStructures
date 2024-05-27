package JavaConcepets;

public class RangeSum {
    public static void main(String[] args) {
        int mat[][] = new int[][]{
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}
        };
        NumMatrix nm = new NumMatrix(mat);
    }
}

class NumMatrix {
    int [][]arr;
    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        arr = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                if(i == 0 || j == 0){
                    if(i == 0 && j == 0){
                        arr[i][j] = matrix[i][j];
                    }else if(i == 0){
                        arr[i][j] = matrix[i][j] + arr[i][j - 1];
                    }else if(j == 0){
                        arr[i][j] = matrix[i][j] + arr[i - 1][j];
                    }
                }else{
                    arr[i][j] = matrix[i][j] + arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
                }
            }
        }
        System.out.println(arr);
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {

        if(row1 == 0 || col1 == 0){

            if(row1 == 0 && col1 == 0){
                return arr[row2][col2];
            }else{
                if(row1 == 0){
                    return arr[row2][col2] - arr[row2][col1 - 1];
                }else{
                    return arr[row2][col2] - arr[row1 - 1][col2];
                }
            }
        }
        return arr[row2][col2] - arr[row2][col1 - 1] - arr[row1- 1][col1] + arr[row1 - 1][col1 - 1];
    }
}