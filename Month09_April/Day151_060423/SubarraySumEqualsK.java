package Month09_April.Day151_060423;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,0,1}, 1));
    }

    static int solve(int A[], int B){
        HashMap<Long, Integer> map = new HashMap<>();
        int count = 0;

        map.put((long)A[0], 1);
        long sum = A[0];

        if(sum == B){
            count++;
        }

        for(int i = 1; i < A.length; i++){
            sum += A[i];

            if(sum == B){
                count++;
            } if(map.containsKey(sum - B)){
                count += map.get(sum - B);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
