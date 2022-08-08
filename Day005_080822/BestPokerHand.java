package gg.Day005_080822;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class BestPokerHand {
    public static void main(String[] args) {
        System.out.println(pokerHand(new int[]{10,10,12,2,9}, new char[]{'a', 'd', 'a', 'a', 'a'}));
    }

    static String pokerHand(int arr[], char[] suits) {

        Set<Character> set = new HashSet<>();
        String str = "High Card";
        boolean allfive = false;
        set.add(suits[0]);
        for (char ch : suits) {
            if (set.contains(ch)) {
                allfive = true;

            } else {
                allfive = false;
                break;
            }
        }
        if (allfive) return "Flush";

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
            if(map.get(i)==3) {
                return   "Three of a Kind";
            }else if(map.get(i)==2) str = "Pair";
        }
        return str;
    }
}
