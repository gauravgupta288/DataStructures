package JavaConcepets;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1,2);
        map.put(2,4);
        map.put(3,2);

        System.out.println(map.remove(2));
        System.out.println(map);
    }
}
