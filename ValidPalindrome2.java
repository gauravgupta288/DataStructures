package gg;

public class ValidPalindrome2 {
    static int count = 0;

    public static void main(String s[]) {
        System.out.println(validPalindromeSol2("abc"));
    }

    /**
     * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
     * Ex:- Input: s = "abca"
     * Output: true
     * Explanation: You could delete the character 'c'.
     *
     * @param s
     * @return
     */
    static boolean validPalindrome(String s) {
        String s1 = s;
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);

            if (ch1 != ch2 && count <= 1) {
                if (count == 0) {
                    count++;
                    return validPalindrome(s.substring(start + 1, end + 1));
                } else if (count == 1) {
                    return validPalindrome(s1.substring(start, end));
                } else {
                    return false;
                }

            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    static boolean validPalindromeSol2(String s) {
        int f = 0;
        int l = s.length() - 1;

        while (f <= l) {
            if (s.charAt(f) != s.charAt(l)) {
                return isPalindrome(s, f + 1, l ) || isPalindrome(s, f, l-1);
            }
            f++;l--;
        }
        return true;
    }

    static boolean isPalindrome(String s, int f, int l) {
        while (f <= l) {
            if (s.charAt(f) != s.charAt(l)) return false;
            f++;l--;
        }
        return true;
    }
}
