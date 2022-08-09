package gg.Day006_090822;

public class CountAsterisks {
    public static void main(String[] args) {
        System.out.println(countAstericks("yo|uar|e**|b|e***au|tifu|l"));
    }

    static int countAstericks(String s) {

        int pipe = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '|') pipe++;
            else if (pipe % 2 == 0 && ch == '*') {
                count++;
            }

        }
        return count;
    }
}
