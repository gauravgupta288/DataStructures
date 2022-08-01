public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 6};

        mergeSortedArray(arr1, arr1.length, arr2, arr2.length);
    }

    static void mergeArrays(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        int k = 0;

        int arr3[] = new int[m + n];
        while (j < n && i < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                arr3[k++] = arr2[j++];
            } else {
                arr3[k++] = arr1[i];
                i++;
            }
        }
        while (i < m) {
            arr3[k++] = arr1[i++];
        }
        while (j < n) {
            arr3[k++] = arr2[j++];
        }
    }

    static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (nums1[i] == 0) {
                nums1[i++] = nums2[j++];
            } else if (nums1[i] <= nums2[j]) {
                i++;
            } else if (nums1[i] >= nums2[j]) {
                nums1[i + 1] = nums1[i];
                nums1[i++] = nums2[j++];

            }


        }
        while (j < n) {
            nums1[i++] = nums2[j++];
        }
    }
}
