public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {3,};
        int arr2[] = {-2,-1};

        mergeArrays(arr1, arr2);
    }

    static double mergeArrays(int[] arr1, int[] arr2) {

        int len;
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

        len = arr3.length;
        if(len==1){
            return arr3[0];
        }
        if (len % 2 == 0) {
return (arr3[len/2] + arr3[(len/2)-1])/2;
        } else {
            return arr3[(len / 2)] ;
        }
    }

    static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
