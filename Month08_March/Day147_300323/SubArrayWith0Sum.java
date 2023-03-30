package Month08_March.Day147_300323;

import java.util.HashSet;

public class SubArrayWith0Sum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{ 1, 2, 3, 4, 5}));
    }

    static int solve(int A[]){
        HashSet<Long> set = new HashSet<>();
        long newArr[] = new long[A.length];

        set.add(newArr[0]);
        newArr[0] = A[0];
        for(int i = 1; i < A.length; i++){
            if(A[i] == 0){
                return 1;
            }
            newArr[i] = A[i] + newArr[i - 1];
            if(set.contains(newArr[i]) || newArr[i] == 0){
                return 1;
            }

            set.add(newArr[i]);
        }

        return 0;
    }
}
