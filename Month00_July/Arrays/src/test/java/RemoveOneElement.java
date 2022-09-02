public class RemoveOneElement {
    public static void main(String[] args) {
        int[] arr = {13, 205, 553, 527, 790, 238};

        System.out.println(removeone(arr));
    }

    static boolean removeone(int[] arr) {
        boolean flag = false;
        int p = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (p >= arr[i]) {
                if (flag) {
                    return false;
                }
                flag = true;
                if (i == 1 || arr[i] > arr[i - 2]) {
                    p = arr[i];
                }

            } else {
                p = arr[i];

            }
        }
        return true;
    }

}