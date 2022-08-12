package gg.Day008_110822;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        treeMap();
    }

    static void treeMap() {

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("1", "bunny");
        treeMap.put("3", "Ryan");
        treeMap.put("", "Avayukt");

        for (String s : treeMap.values()) {
            System.out.print(s);
        }
    }
}
