package Month07_Feb.Day111_160223;

public class PerfectSqaure {
    public static void main(String[] args) {
        System.out.println(perfectSquare(20000000));
    }

    public static boolean perfectSquare(int num) {

        int start = 0;
        int end = num;
        while (start < end) {
            int mid = (start + (end - start)) / 2;
            long m = mid * mid;
            if (m == num) {
                return true;
            } else if (m < num) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return false;
    }
}
