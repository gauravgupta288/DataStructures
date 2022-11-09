package Month04_Nov.Day070_091122;

import java.util.ArrayList;

public class MissingAndRepeatingNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(3);list.add(5);list.add(4);list.add(4);
        missing(list, 5);
    }

    static int[] missing(ArrayList<Integer> arr, int n) {

        int arr1[] = new int[n + 1];
        int res[] = new int[2];
        for (int i = 0; i < arr.size(); i++) {

            arr1[arr.get(i)]++;
        }

        for (int i = 1; i < arr1.length; i++) {
            if(arr1[i] == 0){
                res[0] = i;
            }
            if(arr1[i] > 1 ){
                res[1] = i;
            }
        }
        return res;
    }
}
