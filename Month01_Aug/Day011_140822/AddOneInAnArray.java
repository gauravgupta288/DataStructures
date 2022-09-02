package gg.Month01_Aug.Day011_140822;

import java.util.Vector;

public class AddOneInAnArray {
    public static void main(String[] args) {
addOne(new int[]{1,2,3,4}, 4);
    }

    static int[] addOne(int arr[],int n) {
        int carry = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i] + carry;
            if (num == 10) {
                carry = 1;
                arr[i] = 0;
            } else {
                carry = 0;
                arr[i] = num;
            }
        }
        if (carry == 1) {
            int newArray[] = new int[arr.length+1];
            newArray[0] =1;
            return newArray;
        }

        return arr;
    }
}
