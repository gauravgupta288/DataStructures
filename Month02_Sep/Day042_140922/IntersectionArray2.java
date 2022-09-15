package gg.Month02_Sep.Day042_140922;

import java.util.*;

public class IntersectionArray2 {
    public static void main(String[] args) {
        System.out.println(intersection(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    static int[] intersection(int nums1[], int nums2[]){
        Set<Integer> list = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (map.containsKey(i)) {
                if (map.get(i) == 1) {
                    map.remove(i);
                } else {
                    map.put(i, map.get(i) - 1);
                }
                list.add(i);
            }
        }
        int[] res = new int[list.size()];


        int j =0;
        for(int i:list){
            res[j++]=i;
        }

        return res;
    }
}
