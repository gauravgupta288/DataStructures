package Month10_May.Day179_120523;

import java.util.HashMap;
import java.util.Map;

public class ExcelCoumn2 {
    public static void main(String[] args) {
        System.out.println(solve("AB"));
    }

    static int solve(String columnTitle) {
        Map<Character, Integer > map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int ans = 0;

        for(int i = 0; i < 26; i++){
            map.put((char)('A' + i), i);
        }
        String []strList = columnTitle.split("");
        int temp = 0;
        for(int i = strList.length - 1; i >= 0; i--){
            char ch = strList[i].charAt(0);
            int t = map.get(ch);
            int x = (int)Math.pow(26, temp++);
            ans +=  (t + 1) * x;
        }

        return ans;
    }
}
