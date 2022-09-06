package gg.Month02_Sep.Day034_060922;

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        System.out.println(checkIfStringIsEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
    }
    static boolean checkIfStringIsEqual(String[] word1, String[] word2){
        StringBuilder sb =  new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String str:word1){
            sb.append(str);
        }
        for(String str:word2){
            sb2.append(str);
        }

        return sb.toString().equals(sb2.toString());
    }
}
