package gg;

public class ConstructTheRectangle {
    public static void main(String[] args) {
        System.out.println(addArray(new int[]{1, 0, 2}));
    }

    static int[] constructRact(int n) {
        int temp[] = {n, 1};
        int i = n / 2;
        int minDiff = n - 1;
        while (i > 1) {
            if (n % i == 0) {
                int k = n / i;
                if (i >= k && minDiff > (i - k)) {
                    minDiff = i - k;
                    temp[0] = i;
                    temp[1] = k;
                }
            }
            i--;
        }
        return temp;
    }

    static int addArray(int arr[]) {

        int s = 0;
        int e = arr.length;
        int sum = 0;
        while (s < e) {
            if (e / 2 == s) {
                sum += arr[s++];
            } else {
                sum += arr[s++] + arr[--e];
            }
        }
        return sum;
    }
    static void add(){

    }
}
