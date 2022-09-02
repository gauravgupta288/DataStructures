package gg.Month01_Aug.Day021_240822;

public class SearchElementIn2DArray {
    public static void main(String[] args) {
        System.out.println(searchElement(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}}, 3));
    }

    static boolean searchElement(int arr[][], int target) {

        int row = arr.length;
        int col = arr[0].length;

        int rowIndex = 0;
        int colIndex = col - 1;

        while (row >= rowIndex && colIndex >= 0) {
            int element = arr[rowIndex][colIndex];

            if (element == target) {
                return true;
            }
            if (element < target) {
                rowIndex++;
            } else {
                colIndex--;
            }
        }

        return false;
    }
}
