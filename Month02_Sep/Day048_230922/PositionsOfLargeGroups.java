package gg.Month02_Sep.Day048_230922;

import java.util.ArrayList;
import java.util.List;

public class PositionsOfLargeGroups {
    public static void main(String[] args) {
        System.out.println(positions("abbxxxxzyy"));
    }

    static List<List<Integer>> positions(String s) {

        int start = 0;
        int end = 0;
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();

        int j = 0;
        for (int i = 0; i + j < s.length() - 1; i++) {
            while (s.charAt(i) == s.charAt(i + j + 1)) {
                start = i;
                j++;
                count++;
            }
            end = j+i;
            if (count >= 3) {
                list.add(List.of(start, end));
            }
            count = 0;
            j=0;
        }

        return list;
    }
}
