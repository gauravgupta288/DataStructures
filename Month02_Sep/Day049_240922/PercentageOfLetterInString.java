package gg.Month02_Sep.Day049_240922;

public class PercentageOfLetterInString {
    public static void main(String[] args) {
        System.out.println(percentageOfLetter("foobar", 'o'));
    }

    static int percentageOfLetter(String s, char letter) {
        int count = 0;
        for(char c:s.toCharArray()){
            if(letter == c){
                count++;
            }
        }
        return (count * 100)/s.length();
    }
}
