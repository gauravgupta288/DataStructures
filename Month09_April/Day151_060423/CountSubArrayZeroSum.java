package Month09_April.Day151_060423;

import java.util.HashMap;

public class CountSubArrayZeroSum {
    public static void main(String[] args) {

    }

    static int solve(int A[]){
        HashMap<Long , Long> set = new HashMap<>();
        long newArr[] = new long[A.length];

        set.put((long)A[0], (long)1);
        newArr[0] = A[0];
        int count = 0;

        if(A[0] == 0){
            count++;
        }
        for(int i = 1; i < A.length; i++){
            newArr[i] = A[i] + newArr[i - 1];
            if(newArr[i] == 0){
                count += set.get(newArr[i]);
            }
            if(set.containsKey(newArr[i])){
                count += set.get(newArr[i]);
            }

            set.put(newArr[i], (long)set.getOrDefault(newArr[i], (long)0) + 1);
        }

        return count % 1000000007;
    }
}
