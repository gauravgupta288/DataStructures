package Month09_April.Day150_030423;

import java.util.HashMap;

public class CountPairSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{90, 497, -411, 990, 145, 353, 314, -349, -260, -956, 258, -665, -241, 192, 605, 264, -819, -497, 829, 775, -392, 292, 997, 549, 556, 561, 627, -533, 541, -871, 240, 813, 174, -399, -923, -785}, -466));
    }

    static int solve(int A[], int B){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            int n = Math.abs(B - A[i]);
            int k = B + A[i];

            if(map.containsKey(n) || map.containsKey(k)){
                return 1;
            }
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        return 0;
    }
}
