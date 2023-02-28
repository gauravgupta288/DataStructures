package Month07_Feb.Day117_270223;

public class EvenSubArrays {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{10,2,3,4,5,4,5,4,3,10}));
    }

    static String solve(int A[]) {
        if(A.length % 2 != 0){
            return "NO";
        }

        if(A[A.length - 1] % 2 == 0 && A[0] % 2 == 0){
            return "YES";
        }else{
            return "NO";
        }
    }

    static boolean oddOrEven(int arr[], int n) {

        for (int i = 1; i < arr.length; i = i + n ) {
            if (arr[i - 1] % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
