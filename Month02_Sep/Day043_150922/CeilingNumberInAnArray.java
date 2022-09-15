package gg.Month02_Sep.Day043_150922;

public class CeilingNumberInAnArray {
    public static void main(String[] args) {
        System.out.println(ceiling(new int[]{1,2,3,5,7,9,12}, 5));
    }

    //Index of number which is >= to target
    static int ceiling(int nums[], int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        //If no number is greater that target
        if (nums[nums.length - 1] < target) {
            return ans;
        }
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }

        return ans;
    }
}
