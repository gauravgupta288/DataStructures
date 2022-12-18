package Month05_Dec.Day098_171222;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
    }

    static boolean uniqureOccurences(int arr[]){
        Set<Integer> set = new HashSet<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i : map.values()){
            set.add(i);
        }

        return map.size() == set.size();
    }
}
