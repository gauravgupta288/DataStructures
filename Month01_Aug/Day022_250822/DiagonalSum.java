package gg.Month01_Aug.Day022_250822;

public class DiagonalSum {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    static int diagonalSum(int mat[][]) {
        int sum = 0;

        int row = 0;
        int col = 0;
        int colEnd = mat.length-1;

        while(row<mat.length){
            if(row == col){
                sum += mat[row][col];
            } if(row != colEnd){
                sum += mat[row][colEnd];
            }
            row++;
            col++;
            colEnd--;
        }
        return sum;
    }
}
