package gg.Day024_270822;

public class NumberOfValidWords {
    public static void main(String[] args) {
        System.out.println(validWords("a-b-c"));
    }

    static int validWords(String sentence) {
        String strList[] = sentence.split(" ");
        int count = 0;
        for (String word : strList) {
            if (isValidWord(word)) {
                count++;
            }
        }
        return count;
    }

    static boolean isValidWord(String word) {
        char ch[] = word.toCharArray();
        if (word.equals("") || word.equals(" ")) return false;
        int hyphens = 0;

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                return false;
            } else if (ch[i] == '-') {
                hyphens++;
                if (hyphens == 2 || i == 0 || i == word.length() - 1) {
                    return false;
                } else if (!Character.isAlphabetic(ch[i - 1]) || !Character.isAlphabetic(ch[i + 1])) {
                    return false;
                }
            } else if (ch[i] == '!' || ch[i] == ',' || ch[i] == '.') {
                if (i != word.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
