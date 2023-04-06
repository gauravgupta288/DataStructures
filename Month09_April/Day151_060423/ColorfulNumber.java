package Month09_April.Day151_060423;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ColorfulNumber {
    public static void main(String[] args) {
        System.out.println(solve(3245));
    }

    static int solve(int A){
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Long> map = new LinkedHashMap<>();

        while(A > 0){
            arr.add(A % 10);
            A /= 10;
        }
        map.put(0, (long)arr.get(arr.size() - 1));

        int k = 1;
        for(int i = arr.size() - 2; i >= 0; i--){
            long n = map.get(k - 1) * arr.get(i);
            if(map.containsValue((n))){
                return 0;
            }
            map.put(k++, n);
        }

        int size = map.size();;
        for(int i = 1; i < size; i++){
            for(int j = 0; j< i;j++){
                long n = map.get(i) / map.get(j);

                if(map.containsValue(n)){
                    return 0;
                }
                map.put(k++, n);
        }
        }
        return 1;
    }
}
