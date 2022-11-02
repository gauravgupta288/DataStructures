package Month04_Nov.Day063_011122;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        sum(new int[]{9,9,9,9,9,9,9,9,9,9}, 1);
    }

    static List<Integer> sum(int[] num, int k) {
        long sum1 = 0;
        List<Integer> list = new ArrayList<>();
        for (int i : num) {
            sum1 = sum1 * 10 + i;
        }
        long x = sum1 + (long)k;

        long sum = 0;
        while (x != 0) {
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        while (sum != 0) {
            list.add( (int)sum % 10);
            sum /= 10;
        }
        return list;
    }
}
