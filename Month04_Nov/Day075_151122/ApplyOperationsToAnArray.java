package Month04_Nov.Day075_151122;

import java.util.ArrayList;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        applyOperation(new int[]{0, 1});
    }

    static int[] applyOperation(int[] arr){

        int k = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                arr[i - 1] *= 2;
                arr[i] = 0;
            }
        }

        for(int i = 0;i< arr.length; i++){
            if(arr[i] > 0){
                arr[k++] = arr[i];
                //arr[i] = 0;
            }
        }

        for(int i = k;i< arr.length;i++){
            arr[i] = 0;
        }
        return arr;
    }
}
