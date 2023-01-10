package Month05_Dec.Day105_241222;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TotalSumCOunt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(1);list.add(1);
        System.out.println(sumCount(list, 2));
    }

    static int sumCount(ArrayList<Integer> A, int B){
        Map<Integer, Integer> map = new HashMap<>();
        int total = 0;

        for(int i = 0; i < A.size();i++){
            if(map.containsKey(B - A.get(i))){
                total += map.get(B - A.get(i));
            }
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
        }
        return total;
    }
}
