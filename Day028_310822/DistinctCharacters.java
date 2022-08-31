package gg.Day028_310822;

public class DistinctCharacters {
    public static void main(String[] args) {
        System.out.println(distinctChar2("icolgrjedehnd"));
    }

    static int distinctChar(String s) {
        int count = 0;

        if (s.length() < 3) return 0;
        char ch[] = s.toCharArray();
        char a = ch[0];
        char b = ch[1];
        char c = ch[2];
        for (int i = 3; i < ch.length; i++) {
            if (a != b && b != c && c != a) {
                count++;
            }
            a = b;
            b = c;
            c = ch[i];
        }
        if (a != b && b != c && c != a) {
            count++;
        }
        return count;
    }

    static int distinctChar2(String s) {
        int count = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i - 1) != s.charAt(i) && s.charAt(i) != s.charAt(i + 1) && s.charAt(i + 1) != s.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}
