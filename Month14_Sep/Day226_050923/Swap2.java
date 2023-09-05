package Month14_Sep.Day226_050923;

import java.util.Arrays;
import java.util.List;

public class Swap2 {
    public static void main(String[] args) {
        System.out.println(solve(Arrays.asList(1,2,3,4,0)));
    }

    public static int solve(List<Integer> A) {
        int ans = 0;
        int i = 0;
        while (i < A.size()) {
            if (A.get(i) != i) {
                int temp = A.get(A.get(i));
                A.set(A.get(i), A.get(i));
                A.set(i, temp);
                ans++;
            }else{
                i++;
            }
        }
        return ans;
    }
}
