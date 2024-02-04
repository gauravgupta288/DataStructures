package Backtracking;

public class Temp {
    public static void main(String[] args) {
        String str1 = "abacaba";

//        String str2 = "aba";
//
//        System.out.println(str2.equals(str1.substring(0, str2.length())));


    }

    public int minimumTimeToInitialState(String word, int k) {
        int count = 0;
        boolean ans = false;
        while (ans){
            String temp = word.substring(k);

            if(temp.equals(word.substring(0, temp.length()))){
                ans = true;
            }

        }

        return count;
    }
}
