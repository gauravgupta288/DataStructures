package gg.Day009_120822;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        summaryRange(new int[]{0,2,3,4,6,8,9});
    }

    static List<String> summaryRange(int[] arr) {
        List<String> list = new ArrayList<>();
        boolean found = false;
        String num1 = "";
        String num2 = "";
        num1 = String.valueOf(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]+1 == arr[i]) {
                found = true;
                num2 = String.valueOf(arr[i]);
            } else {
                if (found) {
                    list.add(num1 + "->" + num2);
                } else {
                    list.add(num1);
                }
                found = false;
                num1 = String.valueOf(arr[i]);
            }
        }
        if(found)list.add(num1 + "->" + num2);
        else list.add(num1);
        return list;
    }
}
