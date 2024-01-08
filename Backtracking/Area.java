package Backtracking;

public class Area {
    public static void main(String[] args) {
        System.out.println(areaOfMaxDiagonal(new int[][]{{10,20}, {1,2}, {5,6}, {6,7}}));
    }

    public static int areaOfMaxDiagonal(int[][] dimensions) {
        double max = Double.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < dimensions.length; i++){
            int x = dimensions[i][0];
            int y = dimensions[i][1];

            double sq = Math.sqrt((x * x) + (y * y));

            if(max < sq){
                index = i;
                max = sq;
            }
        }

        return dimensions[index][0] * dimensions[index][1];
    }
}
