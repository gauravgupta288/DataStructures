package gg.Month03_Oct.Day051_081022;

import java.util.ArrayList;
import java.util.List;

public class TwoOutOfThree {
    public static void main(String[] args) {
        System.out.println(twoOutOfThree(new int[]{1,1,3,2}, new int[]{2,3}, new int[]{3}));
    }

    static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        int[] digits = new int[101];
        List<Integer> and = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            digits[nums1[i]] =  1;
        }
        for (int i = 0; i < nums2.length; i++) {
            digits[nums2[i]] = digits[i] + 1;
        }
        for (int i = 0; i < nums3.length; i++) {
            digits[nums3[i]] = digits[i] + 1;
        }

        for(int i = 1;i< digits.length;i++){
            if(digits[i]>1){
                and.add(digits[i]);
            }
        }
        return and;
    }
}
