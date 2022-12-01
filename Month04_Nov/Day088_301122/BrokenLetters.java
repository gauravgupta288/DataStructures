package Month04_Nov.Day088_301122;

public class BrokenLetters {
    public static void main(String[] args) {
        System.out.println(typeLetter("leet code", "ee"));
    }

    static int typeLetter(String text, String brokenLetters) {
        int count = 0;

        String[] word = text.split(" ");
        boolean flag = false;

        for (String s : word) {
            for (char ch : brokenLetters.toCharArray()) {
                if (s.indexOf(ch) != -1) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;

            }
            flag = false;
        }

        return count;
    }

    public int brokenWord(String text, String brokenLetters) {
        int count = 0;



        return count;
    }
}
