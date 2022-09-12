package gg.Month02_Sep.Day039_110922;

import java.util.*;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
        Map<Integer, Integer> map = new TreeMap<>();

        map.put(1, 100);
        map.put(-1,200);
        map.put(0, 0);
        map.put(100,-10000);

        System.out.println(map);
    }

    static int partitionString(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                count++;
                set.clear();
            }
            set.add(ch);
        }
        return count+1;


    }
}
