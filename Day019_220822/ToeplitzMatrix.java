package gg.Day019_220822;

public class ToeplitzMatrix {
    public static void main(String[] args) {
        System.out.print(toeplitzMat(new int[][]{{1,2,2,4}, {5,1,2,3}, {9,5,1,2}}));
    }

    static boolean toeplitzMat(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if(arr[i][j] != arr[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
