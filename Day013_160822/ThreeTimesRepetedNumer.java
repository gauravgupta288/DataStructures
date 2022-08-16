package gg.Day013_160822;

import java.util.HashMap;
import java.util.List;

public class ThreeTimesRepetedNumer {
    public static void main(String[] args) {
        System.out.print(repeatedNumber(List.of(1,2,3,1,1)));
    }

    static int repeatedNumber(final List<Integer> a) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            map.put(a.get(i), map.getOrDefault(a.get(i), 0) + 1);

            if (map.get(a.get(i)) > a.size() / 3) return a.get(i);
        }

        return -1;
    }
}
