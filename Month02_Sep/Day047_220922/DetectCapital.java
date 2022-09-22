package gg.Month02_Sep.Day047_220922;

public class DetectCapital {
    public static void main(String[] args) {

    }

    static boolean cap(String word) {
        if(word.length()==1){
            return true;
        }

        char ch[] = new char[word.length()];

        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && Character.isLowerCase(ch[i])) {


            } else if (i == 0 && Character.isUpperCase(ch[i])) {

            }
        }
        return true;
    }
}
