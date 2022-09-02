package gg.Month01_Aug.Day011_140822;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
System.out.print(missingNumber(new int[]{1,2,3,5}, 5));
    }
    static int missingNumber(int array[], int n){
        int sum = 0;
        for(int i:array){
            sum += i;
        }
        Arrays.sort(array);
        return n*(n+1)/2 - sum;
    }
}
