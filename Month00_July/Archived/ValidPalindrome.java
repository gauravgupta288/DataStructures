package gg.Month00_July.Archived;

public class ValidPalindrome {
    public static void main(String s[]) {
        System.out.println(validPalindrome("A man, a plan, a canal: Panama"));
    }

    static boolean validPalin(String s) {
        if (s.length() == 2) {
            if (s.charAt(0) != s.charAt(1)) return false;
        }
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (s.charAt(start) == ' ' || !((s.charAt(start) >= 65 && s.charAt(start) <= 90 || (s.charAt(start) >= 97 && s.charAt(start) <= 122)))) {
                start++;
                continue;
            } else if (s.charAt(end) == ' ' || !((s.charAt(end) >= 65 && s.charAt(end) <= 90 || (s.charAt(end) >= 97 && s.charAt(end) <= 122)))) {
                end--;
                continue;
            } else if ((s.toLowerCase().charAt(start) != s.toLowerCase().charAt(end))) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char ch1 = Character.toLowerCase(s.charAt(start));
            char ch2 = Character.toLowerCase(s.charAt(end));
            if (ch1 == ' ' || !(Character.isLetterOrDigit(ch1))) {
                start++;
                continue;
            } else if (ch2 == ' ' || !(Character.isLetterOrDigit(ch2))) {
                end--;
                continue;
            } else if ((Character.isLetterOrDigit(ch1) || Character.isLetterOrDigit(ch2)) && ch1 != ch2) {
                return false;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }
}
