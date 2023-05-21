package Month10_May.Day186_210523;

import java.util.ArrayList;
import java.util.List;

public class ValidArray {
    public static void main(String[] args) {
        System.out.println(combine(3, 2));
    }

    static List<List<Integer>> combine(int A, int B) {
        List<List<Integer>> ans = new ArrayList<>();

        solve(1, A, B, new ArrayList<>(), ans);
        return ans;
    }

    static void solve(int i, int A, int B, List<Integer> temp, List<List<Integer>> ans) {
        if (B == 0) {
            ans.add(temp);
            return;
        }
        solve(i + 1, A, B, temp, ans);
        temp.add(i);
        solve(i + 1, A, B - 1, temp, ans);
    }
}
