package Month08_March.Day147_300323;

import java.util.HashSet;

public class CountSubarrayZeroSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{30, -30, 30, -30 }));
    }

    static int solve(int[] A){
        HashSet<Long> set = new HashSet<>();
        long newArr[] = new long[A.length];

        set.add((long)A[0]);
        newArr[0] = A[0];
        int count = 0;

        if(A[0] == 0){
            count++;
        }
        for(int i = 1; i < A.length; i++){
            newArr[i] = A[i] + newArr[i - 1];
            if(set.contains(newArr[i]) || newArr[i] == 0 || A[i] == 0){
                count++;
            }
            set.add(newArr[i]);
        }
        return count;
    }
}
