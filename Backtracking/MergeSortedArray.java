package Backtracking;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeSortedArray {
    public static void main(String[] args) {
        mergeArray(new int[]{1,3,4}, new int[]{2,5});
    }

    public static void mergeArray(int arr1[], int arr2[]){

        Stream
                .of(arr1, arr2)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }
}
