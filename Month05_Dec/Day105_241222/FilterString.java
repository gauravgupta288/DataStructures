package Month05_Dec.Day105_241222;

import java.util.HashMap;
import java.util.Map;

public class FilterString {


    public static void main(String[] args) {
        String s[] = {"java", "python", "java", "ruby"};
        String result[] = new String[4];

        Map<String, Integer> map = new HashMap<>();
        for(String s1 : s){

            map.put(s1, map.getOrDefault(s1, 0) + 1);
        }
        int i = 0;
        for(String key : map.keySet() ){
            if(map.get(key) == 1){
                result[i++] = key;
            }
        }
    }
}
