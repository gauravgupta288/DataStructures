package Month08_March.Day129_110323;

import java.util.HashMap;
import java.util.Map;

public class NBy3RepeaterNumber {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3,1,1}));
    }

    static int solve(int[] A){
        Map<Integer, Integer> a = new HashMap<>();

        for(int i : A){
            a.put(i, a.getOrDefault(i, 0) + 1);
        }

        for(int i : a.keySet()){
            if(a.get(i) > A.length/3){
                return i;
            }
        }

        return -1;
    }
}
