package gg.Day019_220822;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInMatri {
    public static void main(String[] args) {
        System.out.print(luckyNumber(new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}}));
    }

    //A number is called when its minimum in its row and maximum in its column in a Matrix
    static List<Integer> luckyNumber(int arr[][]) {

        int minIndex = 0;
        List<Integer> luckyNum = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int minInRow = Integer.MAX_VALUE;
            int maxInCol = Integer.MIN_VALUE;
            //find min in row
            for (int j = 0; j < arr[0].length; j++) {
                if (minInRow > arr[i][j]) {
                    minInRow = arr[i][j];
                    minIndex = j;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                maxInCol = Math.max(maxInCol, arr[j][minIndex]);
            }
            if (minInRow == maxInCol) {
                luckyNum.add(minInRow);
            }
        }
        return luckyNum;
    }
}
