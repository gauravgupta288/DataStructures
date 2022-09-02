package gg.Month01_Aug.Day022_250822;

public class SortingTheSentence {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

    static String sortTheSentence(String s) {
        String str[] = s.split(" ");
        String newStr[] = new String[str.length];

        int i = 0;
        while (i < str.length) {
            for (int j = 1; j < 10; j++) {
                if (str[i].contains(Integer.toString(j))) {
                    newStr[j - 1] = str[i].split(Integer.toString(j))[0];
                    break;
                }
            }
            i++;
        }

        return String.join(" ", newStr);
    }

    static String sortSentence(String s) {
        String str[] = s.split(" ");
        String newStr[] = new String[str.length];

        int j = 0;
        for (String ele : str) {
            int i = ele.charAt(ele.length() - 1) - '0';
            newStr[i - 1] = ele.substring(0, ele.length() - 1);
        }

        return String.join(" ", newStr);
    }
}
