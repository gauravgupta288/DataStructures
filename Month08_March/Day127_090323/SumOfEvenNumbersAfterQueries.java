package Month08_March.Day127_090323;

public class SumOfEvenNumbersAfterQueries {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4}, new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}}));
    }

    static int[] solve(int[] nums, int[][] queries) {

        int sumOfEven = 0;
        int ans[] = new int[queries.length];
        for (int i : nums) {
            if (i % 2 == 0) {
                sumOfEven += i;
            }
        }

        for (int i = 0; i < queries.length; i++) {

            int temp = nums[queries[i][1]] + queries[i][0];
            if (temp % 2 == 0) {
                sumOfEven += temp;

            }
            if (nums[queries[i][1]] % 2 == 0) {
                sumOfEven -= nums[queries[i][1]];
            }

            nums[queries[i][1]] = temp;
            ans[i] = sumOfEven;
        }

        return ans;
    }
}
