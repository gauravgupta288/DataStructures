package Month09_April.Day150_030423;

import java.util.HashMap;

public class PairsWithGivenXor {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, 4, 10, 15, 7, 6}, 5));
    }

    static int solve(int A[], int B){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i : A){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for(int i = 0; i < A.length; i++){
            int n = A[i] ^ B;

            if(map.containsKey(n)){
                count += map.get(A[i]);
            }
        }

        return count;
    }
}
