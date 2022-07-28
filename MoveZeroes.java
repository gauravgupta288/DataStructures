package gg;

public class MoveZeroes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = moveZeroes_sol2();
        print(arr);
//		moveZeroes_sol1();

    }

    static void moveZeroes_sol1() {
        int nums[] = {1, 2, 3, 0, 5, 0};

        int arr[] = new int[nums.length];
        int k = 0;
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            if (nums[i] != 0) {
                arr[k++] = nums[i];
            }
        }
        print(arr);
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] moveZeroes_sol2() {
        int arr[] = {0, 0};

        if (arr.length == 0) {
            return arr;
        }
        int start = 0, end = 1;

        while (end <= arr.length - 1) {
            if (arr[start] == 0 && arr[end] != 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end++;
            } else if (arr[start] == 0) {
                end++;
            } else {
                start++;
                end++;
            }
        }
        return arr;
    }

}
