package gg.Day012_150822;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print(reverse("much.very.program.this.like.i"));
    }

    static String reverse(String S) {
        StringBuilder sb = new StringBuilder();
        String[] str = S.split("\\.");
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]).append(".");
        }
        return sb.toString();
    }
}
