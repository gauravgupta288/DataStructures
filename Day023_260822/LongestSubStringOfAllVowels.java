package gg.Day023_260822;

public class LongestSubStringOfAllVowels {
    public static void main(String[] args) {
        System.out.println(longestSubString("auoeioueiaaioeuieuoaieuaoeuoaiaoueioiaeuiuaeouaoie"));
    }

    static int longestSubString(String s) {
        char charArray[] = s.toCharArray();
        int count = 0;

        char vowels[] = {'a', 'e', 'i', 'o', 'u','u'};
        int i = 0;
        int j = 0;
        int max = 0;
        boolean flag = false;
        while (j < charArray.length) {
            if (vowels[i] == charArray[j]) {
                j++;
                count++;
                flag = true;
            } else if (i+1< vowels.length && vowels[i + 1] == charArray[j]) {
                i++;
                flag = true;
            } else {
                i = 0;
                j++;
                count = 0;
                flag = false;
            }
            if (i == 4 && flag) {
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
