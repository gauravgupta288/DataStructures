package gg.Month01_Aug.Day004_070822;

public class Sort012 {
    public static void main(String[] args) {
sort(new int[]{2,2,0,0,1,0,1});
    }

    static void sort(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        int i = 0;

        while (i <= e) {
            if (arr[i] == 0) {
                int temp = arr[s];
                arr[s] = arr[i];
                arr[i] = temp;
                i++;
                s++;
            } else if (arr[i] == 2){
                int temp = arr[e];
                arr[e] = arr[i];
                arr[i] = temp;
                e--;
            }else {
                i++;
            }
        }
    }
}
