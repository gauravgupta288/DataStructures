package gg.Month02_Sep.Day034_060922;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {
        System.out.println(decrypt("1326#"));
    }

    static String decrypt(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append(returnDecode(s.substring(i, i + 2)));
                i = i + 2;
            } else {
                sb.append(returnDecode(s.substring(i, i + 1)));
            }
        }
        return sb.toString();
    }

    static char returnDecode(String s) {
        return (char) (Integer.parseInt(s) + 96);
    }
}
