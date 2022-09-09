package gg.Month02_Sep.Day037_090922;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        System.out.println(singleElementInSortedArray(new int[]{1,1,2,3,3}));
    }

    static int singleElementInSortedArray(int nums[]) {

        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 0 && nums[mid + 1] == nums[mid] || mid % 2 != 0 && nums[mid - 1] == nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return nums[end];
    }
}
