package Month09_April.Day150_030423;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{19, -10, -13, 10, -13, 6, 7, 2, 18, -19, -4}, 19));
    }

    static int solve(int []A, int B){
        int pre[] = new int[A.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        pre[0] = A[0];

        for(int i = 1; i < pre.length; i++){
            pre[i] = pre[i - 1] + A[i];
        }

        for(int i = 0; i < pre.length; i++){
            if(pre[i] == B){
                count++;
            }else if(map.containsKey(B - pre[i])){
                count += map.get(B - pre[i]);
            }
            map.put(pre[i], 1);
        }

        return count;
    }
}
