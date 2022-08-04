package gg.Archived;

public class BinaryToDecimal {
    public static void main(String s[]) {
        binaryToDecimal("1010", "1011");
    }

    static void binaryToDecimal(String a, String b) {

        int m = a.length();
        int n = b.length();
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        for (int i = 1; i < a.length() && i < b.length(); i++) {

            if (arr1[m - i] == arr2[n - i]) {
                arr1[m - i] = '0';
            } else {
                arr1[m - i] = '1';
            }
        }
    }
}
