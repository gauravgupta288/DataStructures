package Month09_April.Day155_120423;

import java.util.HashMap;
import java.util.Map;

public class FirstOccurence {
    public static void main(String[] args) {
        String str = "sTreSS";
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : str.toLowerCase().toCharArray()){
            char lower = Character.toLowerCase(ch);
            map.put(lower, map.getOrDefault(lower, 0) + 1);
        }

        for(char c : str.toLowerCase().toCharArray()){
            if(map.get(c) == 1){
                if(str.indexOf(c) != -1){
                    System.out.println(c + "");;
                }else{
                    System.out.println((char)(c - 32) + "");;
                }

            }
        }
    }
}
