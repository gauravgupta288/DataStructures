package Month11_June.Day192_010623;

public class FLip {
    public static void main(String[] args) {
        System.out.println(solve(""));
    }

    static int[] solve(String A) {
        int index = 0;
        int l = 0;
        int r = -1;
        int cur = 0;
        int best = 0;

        int arr[] = new int[A.length()];
        for (char ch : A.toCharArray()) {
            if (ch == '0') {
                arr[index++] = 1;
            } else {
                arr[index++] = -1;
            }
        }
        index = 0;

        for (int i = 0; i < arr.length; i++) {
            cur += arr[i];
            if (cur < 0) {
                cur = 0;
                index = i + 1;
            } else if (cur > best) {
                l = index + 1;
                r = i + 1;
                best = cur;
            }
        }
        if (r == -1) {
            return new int[]{};
        }
        return new int[]{l, r};
    }
}
