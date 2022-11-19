package Month04_Nov.Day079_191122;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepetedChar {
    public static void main(String[] args) {
        firstDup("geeksforgeeks");
    }

    static String firstDup(String s){
        Set<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                return String.valueOf(ch);
            }else{
                set.add(ch);
            }
        }
        return "-1";
    }
}
