package gg.Day014_170822;

public class MaximumRepeatingSubstring {
    public static void main(String[] args) {
        System.out.print(maxRepeation("ababvab", "ab"));
    }
    static int maxRepeation(String sequence, String word) {
        int i = 0;
        int count = 0;
        int max = 0;
        boolean flag = false;
        while (i < sequence.length()) {
            int j = 0;
            while (j < word.length()) {
                if (sequence.charAt(i) != word.charAt(j)) {
                    i -= j-1;
                    flag = true;
                    break;
                }
                i++;
                j++;
            }

            if (j == word.length()) {
                count++;
            }
            if(flag && max < count){
                max = count;
                count = 0;
                flag = false;
            }
        }
        return max > count ? max : count;
    }
}
