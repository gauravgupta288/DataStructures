package Month09_April.Day150_030423;

import java.util.HashMap;

public class CountPairSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{19, 8, 17, 17, 16, 6, 3, 11, 25, 17}, 25));
    }

    static int solve(int A[], int B){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < A.length; i++){
            int n = B - A[i];

            if(map.containsKey(n)){
                count += map.get(n);
            }
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        return count % 1000000007;
    }
}
