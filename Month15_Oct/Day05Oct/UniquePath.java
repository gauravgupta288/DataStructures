package Month15_Oct.Day05Oct;

public class UniquePath {
    static  int n = 0;
    public static void main(String[] args) {
        solve(new int[][]{{0, 1}, {0, 0}}, 0, 0);
        System.out.println(n);
    }

    public static void solve(int[][] obstacleGrid, int row, int col){
        if(row == obstacleGrid.length - 1 && col == obstacleGrid[0].length - 1){
            n += 1;
            return;
        }

        if(obstacleGrid[row][col] == 1) return;

        obstacleGrid[row][col] = 1;

        if(row < obstacleGrid.length - 1){
            solve(obstacleGrid, row + 1, col);
        }

        if(col < obstacleGrid[0].length - 1){
            solve(obstacleGrid, row, col + 1);
        }


        obstacleGrid[row][col] = 0;
    }
}
