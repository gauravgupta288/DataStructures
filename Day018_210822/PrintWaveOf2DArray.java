package gg.Day018_210822;

public class PrintWaveOf2DArray {
    public static void main(String[] args) {
        printWave(new int[][]{{1,2,3,00}, {4,5,6,5}, {90,7,8,9}}, 3,4);
    }

    static void printWave(int arr[][], int m, int n) {
        for (int i = 0; i < n; i++) {
            int num = m-1;
            for (int j = 0; j < m; j++) {
                if(i%2==0){
                    System.out.print(arr[j][i] + " ");
                }else{
                    System.out.print(arr[num--][i] + " ");
                }
            }
        }
    }
}
