package Month14_Sep.Day238_300923;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxOrMin {
    public static void main(String[] args) {
        var arrayList = new ArrayList<>(Arrays.asList(4, 7, 3, 8));
        System.out.println(solve(arrayList));
    }

    public static int solve(ArrayList<Integer> A) {

        int min[] = new int[A.size()];
        int max[] = new int[A.size()];
        int m = A.get(0);

        for(int i = 0; i < A.size(); i++){
           m = Math.min(m, A.get(i));
           min[i] = m;
        }

        int mx = A.get(0);
        for(int i = 0; i < A.size(); i++){
            mx = Math.max(mx, A.get(i));

            max[i] = mx;
        }

        int ans = 0;

        for(int i = 1; i < A.size(); i++){
            for(int j = i;j<A.size();j++){

                ans += (max[j] - min[i]) % 1000000007;
            }
        }

        return ans;
    }
}
