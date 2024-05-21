package JavaConcepets;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(solve("ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd", "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t"));
    }

    public static boolean solve(String pattern, String s){
        String list[] = s.split(" ");

        Map index = new HashMap();

        if(list.length != pattern.length()) return false;

        for(Integer i = 0; i < list.length; ++i){

            if (index.put(pattern.charAt(i), i) != index.put(list[i], i))
                return false;
        }

        return true;
    }
}
