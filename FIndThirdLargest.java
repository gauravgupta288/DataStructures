package gg;

public class FIndThirdLargest {

    public static void main(String s[]) {
        int a[] = {3, 2,3,4,1};
        int third = thirdLargestSol2(a);
        System.out.println("third largest number in this array " + third);
    }

    static int thirdLargest(int arr[]) {

        if (arr.length < 3) {
            return -1;
        }
        int first = arr[0], second = arr[1], third = arr[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {

                if (first != second) {
                    third = second;
                }
                second = first;
                first = arr[i];

            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] != first && arr[i] > third && arr[i] != second) {
                third = arr[i];
            }
        }
        if (first == second || second == third) {
            return -1;
        } else {
            return third;
        }
    }

    static int thirdLargestSol2(int[] arr) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;


        for (Integer num : arr) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3)) continue;

            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }

        return max3 == null ? max1 : max3;
    }
}
