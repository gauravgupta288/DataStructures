package gg.Month02_Sep.Day047_220922;

public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(cap("GooglE"));
    }

    static boolean cap(String word) {
        if (word.length() == 1) {
            return true;
        }

        char ch[] = word.toCharArray();

        int i = 1;
        if (Character.isUpperCase(ch[0]) && Character.isUpperCase(ch[1])) {
            while (i < ch.length) {
                if (Character.isLowerCase(ch[i])) {
                    return false;
                }
                i++;
            }

        } else if (Character.isUpperCase(ch[0]) && Character.isLowerCase(ch[1])) {
            while (i < ch.length) {
                if (Character.isUpperCase(ch[i])) {
                    return false;
                }
                i++;
            }
        } else if (Character.isLowerCase(ch[0]) && Character.isLowerCase(ch[1])) {
            while (i < ch.length) {
                if (Character.isUpperCase(ch[i])) {
                    return false;
                }
                i++;
            }
        } else {
            return false;
        }
        return true;
    }

    static boolean capital(String word) {

        if(word.length()==1)return true;

        if(word.toUpperCase().equals(word)) return true;

        if(word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        return false;
    }
}
