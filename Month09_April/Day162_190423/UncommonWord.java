package Month09_April.Day162_190423;

import java.util.HashMap;
import java.util.HashSet;

public class UncommonWord {
    public static void main(String[] args) {
        System.out.println(solve(new String[]{"xy" , "pq", "d"}, new String[]{"e", "d"}));
    }

    static String solve(String []A, String B[]){
        String ans = "";
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> common = new HashSet<>();

        for(String b : B){
            common.add(b);
        }

        for(String a : A){
            if(!common.contains(a)){
                map.put(a, map.getOrDefault(a, 0 ) + 1);
            }
        }
        int val = 0;
        for(String str : map.keySet()){
            int temp = map.get(str);

            if(temp > val){
                ans = str;
                val = temp;
            }
            else if(temp == val){
                if(str.compareTo(ans) < 0){
                    ans = str;
                }
            }
        }


        return ans;
    }
}
