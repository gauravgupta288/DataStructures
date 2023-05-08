package Month10_May.Day176_080523;

import java.util.ArrayList;
import java.util.List;

public class DivisorGame {
    public static void main(String[] args) {
        System.out.println(solve(81991, 2549, 7));
    }

    static int solve(int A, int B, int C){
        int min = Math.min(B, C);
        int max = Math.max(B, C);
        List<Integer> list = new ArrayList<>();

        int count = 0;

        for(int i = 1; i * B <= A; i++){
            list.add(i * min);
        }

        for(int i = 0; i < list.size(); i++){
            int num = list.get(i);
            if(num % max == 0){
                count++;
            }
        }
        return count;
    }
}
