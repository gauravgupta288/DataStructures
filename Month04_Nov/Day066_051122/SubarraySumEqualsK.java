package Month04_Nov.Day066_051122;

import java.util.ArrayList;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(sumArraySum(new int[]{1,2, 3}, 3));
    }

    static int sumArraySum(int[] arr, int s) {
        int sum = 0;
        int index = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            while (sum > s && index < i) {
                sum -= arr[index++];
            }
            if (sum == s) {
                count++;
            }
        }
        return count;
    }
}
