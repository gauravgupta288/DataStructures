package gg.Day024_270822;

public class MaximumRepeatingSubstring {

    public static void main(String[] args) {
        System.out.println(maxRepeating("a", "a"));
    }

    static int maxRepeating(String a, String b) {
        String word = "";
        while (a.contains(word)) {
            word += b;
        }
        return (word.length()-b.length())/b.length();
    }
}
