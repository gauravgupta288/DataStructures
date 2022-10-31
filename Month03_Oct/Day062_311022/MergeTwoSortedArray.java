package gg.Month03_Oct.Day062_311022;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        mergeArray(new int[]{ 0}, 0, new int[]{1}, 1);
    }

    static void mergeArray(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[len] = nums1[i--];
            } else {
                nums1[len] = nums2[j--];
            }
            len--;
        }
        while (i >= 0) {
            nums1[len--] = nums1[i--];
        }

        while (j >= 0) {
            nums1[len--] = nums2[j--];
        }
    }
}
