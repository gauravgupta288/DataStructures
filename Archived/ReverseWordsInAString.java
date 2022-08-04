package gg.Archived;

public class ReverseWordsInAString {
    public static void main(String s[]) {
        System.out.print(reverseSol1("a good   example"));
    }

    static String reverseSol1(String s) {
        String str[] = s.split(" ");
        String s1 = "";
        for (int i = str.length - 1; i >= 0; i--) {
            if(!str[i].equals(" ") && !str[i].equals("")){
            s1 += str[i].trim()+" ";}

        }
        return s1.trim();
    }
    static String reverseSol2(String s) {
        String str[] = s.split(" ");
        String s1 = "";
        for (int i = str.length - 1; i >= 0; i--) {
            if(!str[i].equals(" ") && !str[i].equals("")){
                s1 += str[i].trim()+" ";}

        }
        return s1.trim();
    }
}
