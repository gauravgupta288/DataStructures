package Month04_Nov.Day083_251122;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class FindDuplicatedInAnArray {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> duplicatesSol1(int arr[], int n) {
        // code here

        ArrayList<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int key : map.keySet()){
            if(map.get(key) > 1){
                result.add(key);
            }
        }

        if(result.size() == 0){
            result.add(-1);
        }
        return result;
    }
}
