package gg.Month01_Aug.Day010_130822;

public class AlmostEquivalentStrings {
    public static void main(String[] args) {
        System.out.print(almostEquivalent("aaaa", "bccb"));
    }

    static boolean almostEquivalent(String word1, String word2) {

        int letters[] = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            letters[word1.charAt(i) - 'a']++;
            letters[word2.charAt(i) - 'a']--;
        }

        for (int i : letters) {
            if (i < -3 || i > 3) {
                return false;
            }
        }
        return true;
    }
}
