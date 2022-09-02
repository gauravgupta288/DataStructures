package gg.Month01_Aug.Day016_190822;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.print(binaryGap(15));
    }

    static int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int start = 0; // 10110
        int end = 0;
        int max = 0;
        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);
            if (ch == '1') {
                if (start == 0) {
                    start = i+1;
                } else {
                    end = i+1;
                }
            }
            if (end - start > max) {
                max = end - start;
                start = end;
            }
        }

        return max;
    }
}
