package gg.Month02_Sep.Day040_120922;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(lastOccuranceBinarySearch(new int[]{1,2,2,2,3,5,6,9,10,13,14}, 2));
    }

    static int[] findFirstAndLastPosition(int nums[], int target) {
        int[] res = new int[2];

        int position = firstOccuranceBinarySearch(nums, target);

        if (position == -1) {
            return new int[]{-1, -1};
        }
        return res;
    }

    static int firstOccuranceBinarySearch(int nums[], int target) {

        int start = 0;
        int ans=-1;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (nums[mid] == target) {
                ans = mid;
                end = mid-1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }
    static int lastOccuranceBinarySearch(int nums[], int target) {

        int start = 0;
        int ans = -1;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                ans = mid;
                start = mid+1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;

    }
}
