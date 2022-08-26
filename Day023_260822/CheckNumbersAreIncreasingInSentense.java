package gg.Day023_260822;

public class CheckNumbersAreIncreasingInSentense {
    public static void main(String[] args) {
        System.out.println(areNumbersAscendingSol2("hello world 5 x 5"));
    }

    static boolean areNumbersAscending(String s) {
        String str[] = s.split(" ");
        int last = -1;

        for (String word : str) {
            if (word.chars().allMatch(Character::isDigit)) {
                int i = Integer.parseInt(word);
                if(i <= last){
                    return false;
                }else {
                    last = i;
                }
            }
        }
        return true;
    }

    static boolean areNumbersAscendingSol2(String s){
        String str[] = s.split(" ");
        int last = -1;

        for (String word : str) {
            if (Character.isDigit(word.charAt(0))) {
                int i = Integer.parseInt(word);
                if(i <= last){
                    return false;
                }else {
                    last = i;
                }
            }
        }
        return true;
    }
}
