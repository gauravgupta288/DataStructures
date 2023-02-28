package Month07_Feb.Day117_270223;

public class EvenSubArrays {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{54, 321, 772, 175, 930, 149, 894, 941, 133, 827, 291, 677, 751, 485, 324, 146, 198, 838, 310, 974, 784, 210, 860, 488, 184, 733, 464, 108, 42, 569, 706, 289}));
    }

    static String solve(int A[]) {
        boolean found = true;

        if (A.length % 2 != 0) {
            return "NO";
        }
        if (A[0] % 2 == 0 && A[A.length - 1] % 2 == 0) {
            return "YES";
        }
        for (int i = A.length / 2; i >= 2; i--) {
            if (A.length % i == 0 && i % 2 == 0) {

                if (oddOrEven(A, i)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    static boolean oddOrEven(int arr[], int n) {

        for (int i = 0; i < arr.length; i = i + n ) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
