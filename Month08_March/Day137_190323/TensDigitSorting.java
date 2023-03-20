package Month08_March.Day137_190323;

public class TensDigitSorting {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{7,19,709,15, 11, 7, 19}));
    }

    static int[] solve(int A[]) {

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if(compare(A[i], A[j])){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }

    static boolean compare(int A, int B){
        int k = 0;
        int num = A;
        int rem1 = -1;
        int rem2 = -1;
        while (num > 0) {
            rem1 = num % 10;
            if(k == 1){
                break;
            }
            num /= 10;
            if(num > 0){
                rem1 = num % 10;
            }else{
                rem1 = 0;
            }
            k++;
        }
        int f = 0;
        int num1 = B;
        while (num1 > 0) {
            rem2 = num % 10;
            if(f == 1){
                break;
            }
            if(num1 > 0){
                rem1 = num1 % 10;
            }else{
                rem1 = 0;
            }
            num1 /= 10;
            f++;
        }

        if(rem1 > rem2){
            return true;
        }else if(rem1 == rem2){
            if(A > B){
                return false;
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
}
