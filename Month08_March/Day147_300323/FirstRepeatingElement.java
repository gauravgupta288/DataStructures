package Month08_March.Day147_300323;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{10, 5, 3, 4, 3, 5, 6}));
    }

    static int solve(int []A){
        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int i : A){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }


        for(int i : map.keySet()){
            if(map.get(i) > 1){
                return i;
            }
        }

        return -1;
    }
}
