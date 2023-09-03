package Month14_Sep.Day224_030923;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

        int n = 4;
        int k = 2;
        solve(ans, new ArrayList<>(), 1, n,k );
        System.out.println(ans);
    }

    public static void solve(List<List<Integer>> ans, List<Integer> list, int index, int n, int k){

        if(0 == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i <=n ; i++){
            list.add(i);

            solve(ans, list, i + 1, n, k - 1);

            list.remove(list.size() - 1);
        }

        return;
    }
}
