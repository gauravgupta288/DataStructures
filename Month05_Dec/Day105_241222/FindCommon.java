package Month05_Dec.Day105_241222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindCommon {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(4);list1.add(10);
        list2.add(3);list2.add(6);list2.add(2);list2.add(10);list2.add(10);
        solve(list1, list2);
    }

    static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i : A){
            map1.put(i, map1.getOrDefault(i, 0)+ 1);
        }
        for(int i : B){
            map2.put(i, map2.getOrDefault(i, 0)+ 1);
        }

        if(map1.size() > map2.size()){
            for(int i : map2.keySet()){
                if(map1.containsKey(i)){
                    if(map1.get(i) > map2.get(i)){
                        for(int j =0;j< map2.get(i);j++){
                            ans.add(i);
                        }
                    }else{
                        for(int j =0;j< map1.get(i);j++){
                            ans.add(i);
                        }

                    }
                }
            }

        }else{
            for(int i : map1.keySet()){
                if(map2.containsKey(i)){
                    if(map2.get(i) > map1.get(i)){
                        for(int j =0;j< map1.get(i);j++){
                            ans.add(i);
                        }

                    }else{
                        for(int j =0;j< map2.get(i);j++){
                            ans.add(i);
                        }

                    }
                }
            }
        }

        return ans;
    }

}
