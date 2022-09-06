package gg.Month02_Sep.Day034_060922;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(determineString("boaeok"));

    }

    static boolean determineString(String s) {
        int fhc = 0;
        int shc = 0;
        String vowels = "aeiouAEIOU";

        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (vowels.indexOf(s.charAt(start++))!=-1) {
                fhc++;
            }  if (vowels.indexOf(s.charAt(end--))!=-1) {
                shc++;
            }
        }

        return fhc == shc;
    }
}
