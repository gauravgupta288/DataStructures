package gg;

public class FIndThirdLargest {

    public static void main(String s[]) {
        int a[] = {1, 1, 0, 2,2,3,3,3,4,5,6,};
        int third = thirdLargest(a);
        if (third == -1) {
            System.out.println("No third largest number in this array ");
        } else {
            System.out.println("Third largest number in array " + third);
        }
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
            } else if (arr[i]!= first && arr[i] > third && arr[i] != second ) {
                third = arr[i];
            }
        }
        if (first == second || second == third) {
            return -1;
        } else {
            return third;
        }
    }
}
