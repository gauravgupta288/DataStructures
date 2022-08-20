package gg.Day017_200822;

public class SearchANumberIn2DArray {
    public static void main(String[] args) {
        System.out.println(searchNum(4));
    }

    static boolean searchNum(int num) {
        int arr[][] = new int[3][3];

        //take input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;
            }
        }

        //print
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //sum of rows
        rowSum(arr, arr.length, arr[0].length);

        //search
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    static void rowSum(int arr[][], int n, int m) {
        //sum of row
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            System.out.format("sum of row %d is %d ",  i, sum);
            System.out.println();
        }
    }
}
