package Month04_Nov.Day066_051122;

public class SumUpToZero {
    public static void main(String[] args) {
        sumToZero(5);
    }

    static int[] sumToZero(int n) {
        int[] arr = new int[n];
        int len;
        int i = 0;
        int k = 1;
        if (n % 2 != 0) {
            arr[0] = 0;
            len = n - 1;
        } else {
            len = n;
        }
        while (i < len) {
            arr[i++] = k;
            arr[i++] = -k;
            k++;
        }

        return arr;
    }
}
