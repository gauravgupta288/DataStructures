package gg.Month00_July.Archived;

public class FindSubstring {
    public static void main(String[] s) {
        System.out.println(findSubstring("mississippi", "issip"));
    }

    static int findSubstring(String haystack, String needle) {

        if (needle.length() == 0) return 0;

        int k = 0;

        for (int i = 0; i < haystack.length() && i < needle.length(); i++) {
            int m = i;

            while (needle.length()>k && haystack.length()>m && haystack.charAt(m) == needle.charAt(k)) {
                m++;
                k++;
            }
            if (k == needle.length()) return i;
            else k = 0;
        }
        return -1;
    }
}
