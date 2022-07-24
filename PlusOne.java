package gg;

public class PlusOne {
    public static void main(String s[]) {
        System.out.println(plusOne(new int[]{9,8,9,9}));
    }

    static int[] plusOne(int arr[]) {
        int n = arr.length - 1;
        int arr1[];
        int carry = 1;
        if ((arr[0] == 9 &&  arr.length == 1) || (arr[0] == 9 && arr.length != 1  && arr[1] == 9) )  {
            arr1 = new int[n + 2];
        } else {
            arr1 = new int[n + 1];
        }

        for (int i = n; i >= 0; i--) {
            if (arr[i] == 9 && carry == 1) {
                if(i==0){
                    arr1[i] = 1;
                    carry = 1;
                }else{
                    arr1[i] = 0;
                    carry = 1;
                }
            } else if (arr[i] < 9 && carry == 1) {
                arr1[i] = arr[i] + carry;
                carry = 0;
            } else {
                arr1[i] = arr[i];
            }
        }
        return arr1;
    }
}
