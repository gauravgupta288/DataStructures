package gg.Day015_180822;

public class BitonicPoint {
    public static void main(String[] args) {

    }

    static int bitonicPoint(int[] arr, int n) {

        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return arr[n-1];
    }
}
