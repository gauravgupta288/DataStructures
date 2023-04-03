package Month09_April.Day149_020423;

import java.util.HashMap;

public class LongestSubarrayZeroSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-16, 16, 3, 2 , 0, -2}));
    }

    static int solve(int []A){
        HashMap<Long, Long> map = new HashMap<>();
        long newArr[] = new long[A.length];
        long count = 0;

        map.put((long)A[0], (long)0);
        newArr[0] = A[0];
        for(int i = 1; i < A.length; i++){
            if(A[i] == 0){
                count  = 1;
            }
            newArr[i] = A[i] + newArr[i - 1];
            if(map.containsKey(newArr[i])){
                count = Math.max(count, i - map.get(newArr[i]));
            } else if(newArr[i] == 0){
                count = Math.max(count, i + 1);
            }

            map.put(newArr[i], (long)i);
        }

        return (int)count;
    }
}
