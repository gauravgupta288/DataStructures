package Month10_May.Day178_110523;

import java.util.ArrayList;
import java.util.List;

public class PrimeSum {
    public static void main(String[] args) {
        System.out.println(solve(184));
    }

    static int[] solve(int A) {

        List<Integer> primesNum = primes(A);
        int ans[] = new int[2];

        for (int i = 0; i < primesNum.size(); i++) {
            int temp = primesNum.get(i);
            if (primesNum.contains(A - temp)) {
                ans[0] = temp;
                ans[1] = A - temp;
                break;
            }
        }
        return ans;
    }

    static List<Integer> primes(int A) {
        List<Integer> primesNum = new ArrayList<>();
        int arr[] = new int[A + 1];

        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i * i < arr.length; i++) {
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = 1;
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                primesNum.add(i);
            }
        }

        return primesNum;
    }
}
