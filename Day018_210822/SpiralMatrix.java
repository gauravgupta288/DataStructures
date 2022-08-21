package gg.Day018_210822;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        spiral(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }

    static public List<Integer> spiral(int arr[][]) {
        List<Integer> spiralList = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        int totalElement = row * col;
        int startingCol = 0;
        int endingRow = row - 1;
        int startingRow = 0;
        int endingCol = col - 1;

        while (count < totalElement) {
            for (int index = 0; index <= endingCol; index++) {
                spiralList.add(arr[startingRow][index]);
                count++;
            }
            startingRow++;
            for (int index = startingRow; index <= endingRow; index++) {
                spiralList.add(arr[index][endingCol]);
                count++;
            }
            endingCol--;
            for (int index = endingRow; index >= startingRow; index--) {
                spiralList.add(arr[endingRow][index]);
                count++;
            }
            endingCol--;
            for (int index = endingRow; index <= startingRow && count < totalElement; index++) {
                spiralList.add(arr[startingRow][index]);
                count++;
            }
        }
        return spiralList;
    }
}

