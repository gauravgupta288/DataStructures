package gg.Month02_Sep.Day033_059022;

public class ComplementOfBase10Integer {
    public static void main(String[] args) {
        System.out.println(bitwiseCompSol2(10));
        System.out.println(bitwiseComplement(5));
    }

    static int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        StringBuilder result = new StringBuilder();
        int comp = 0;

        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);
            if (ch == '0') {
                result.append(1);
            } else if (ch == '1') {
                result.append(0);
            }
        }

        for (int i = result.length() - 1; i >= 0; i--) {
            if (result.charAt(i) == '1') {
                comp += Math.pow(2, i);
            }
        }
        return comp;
    }


    static int bitwiseCompSol2(int n) {
        int res = 0;
        int fact = 1;
        if (n == 0) return 1;

        while (n != 0) {
            res += fact * (n % 2 == 0 ? 1 : 0);
            fact *= 2;
            n /= 2;
        }

        return res;
    }
}
