package gg.Day003_060822;

import java.util.ArrayList;

public class NumberWIthSameConsecutiveDiff {
    public static void main(String[] args) {
        numWithSameDiff(3, 7);
    }

    static void numWithSameDiff(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        String str = "";
        for (int i = 1; i <= 9; i++) {
            if (str.length() == n) break;
            int num = i;
            if (i == 1) {
                str += num;
            }else if (num + k < 10) {
                str += num + k;
            } else if (num - k > 0) {
                str += num - k;
            }
            if (num + k > 9 || num - k < 0) {
                continue;
            }
            list.add(Integer.parseInt(str));
        }
    }
}
