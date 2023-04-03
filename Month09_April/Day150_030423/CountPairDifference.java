package Month09_April.Day150_030423;

import java.util.HashSet;

public class CountPairDifference {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{90, 497, -411, 990, 145, 353, 314, -349, -260, -956, 258, -665, -241, 192, 605, 264, -819, -497, 829, 775, -392, 292, 997, 549, 556, 561, 627, -533, 541, -871, 240, 813, 174, -399, -923, -785 }, -466));
    }

    static int solve(int A[], int B){
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            int n = A[i] - B;

            if(map.contains(n)){
                return 1;
            }
            map.add(A[i]);
        }

        return 0;
    }
}
