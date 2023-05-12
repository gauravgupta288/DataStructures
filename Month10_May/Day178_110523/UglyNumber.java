package Month10_May.Day178_110523;

import java.util.ArrayList;
import java.util.List;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    static int nthUglyNumber(int n) {

        int arr[] = new int[1690 + 1];

        for (int i = 1; i < arr.length; i++) {
            List<Integer> fac = isUgly(i);

            for (int j : fac) {
                if (j != 2 && j != 3 && j != 5 && j != 1) {
                    break;
                }
                arr[i] = 1;
            }
        }

        for (int i = 0; i <= n; i++) {
            if (arr[i] == 1) {

            }
        }
        return 0;
    }

    static List<Integer> isUgly(int n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    factors.add(i);
                } else {
                    factors.add(i);
                    factors.add(n / i);
                }
            }
        }

        return factors;
    }
}
