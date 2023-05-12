package Month10_May.Day179_120523;

import java.util.HashMap;
import java.util.Map;

public class ExcelColumn {
    public static void main(String[] args) {
        System.out.println(solve(2345));
    }

    static String solve(int A){
        Map<Integer, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 26; i++){
            map.put(i, (char)('A' + i));
        }

        while(A > 0){
            A -= 1;
            int temp = (A) % 26;
            sb.append(map.get(temp));
            A /= 26;
        }

        return sb.reverse().toString();
    }
}
