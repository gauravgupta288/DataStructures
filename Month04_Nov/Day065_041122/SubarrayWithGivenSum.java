package Month04_Nov.Day065_041122;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        subarray1(new int[]{1, 2, 3, 7, 5}, 5, 12);
    }

    static ArrayList<Integer> subarray(int[] arr, int n, int s) {
        int sum = 0;
        int k = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            while (sum < s) {

            }
        }
        ans.add(-1);
        return ans;
    }

    static ArrayList<Integer> subarray1(int[] arr, int n, int s) {
        int sum = 0;
        int index = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > s && index < i) {
                sum -= arr[index++];
            }
            if (sum == s) {
                ans.add(index + 1);
                ans.add(i + 1);
                return ans;
            }
        }

        ans.add(-1);
        return ans;

    }
}
