public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2,4, 5,};
        int arr2[] = {4, 7,8,8};

        mergeArrays(arr1, arr2);
    }

    static void mergeArrays(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int m = arr1.length;
        int n = arr2.length;
        int k = 0;

        int arr3[] = new int[m + n];
        while (j < n && i<m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                arr3[k++] = arr2[j++];
            }else{
                arr3[k++] = arr1[i];
                i++;
            }
        }
        while(i<m){
            arr3[k++] = arr1[i++];
        }
        while(j<n){
            arr3[k++] = arr2[j++];
        }
    }
}
