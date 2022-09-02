package gg.Month00_July.Archived;

public class repeatedSubstring {
    public static void main(String s[]){
System.out.println(repeatedString("abcabcabcab"));
    }
    static boolean repeatedString(String s){

        int len = s.length();
        if(len%2 !=0)return false;
        int j=len/2;
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(j++))return false;
        }

        return true;
    }
}
