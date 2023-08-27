package Month13_Aug.Day219_260823_Recurtion;

import java.util.ArrayList;

public class ReveseAArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);arr.add(5);
        arr.add(8);
        sort(arr);
    }

    static void reverse(int []arr, int n){
        if(n == -1){
            return ;
        }
        reverse(arr, n-1);
        System.out.print( arr[n] + " ");

    }

    static void sort(ArrayList<Integer> arr){

        if(arr.size() == 0){
            return;
        }
        int temp = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        sort(arr);
        insert(arr, temp);
    }
    static void insert(ArrayList<Integer> arr, int temp){
        if(arr.size() == 0 || arr.get(arr.size() - 1) <= temp){
            arr.add(temp);
            return;
        }

        int x = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);

        insert(arr, x);

        return;
    }
}
