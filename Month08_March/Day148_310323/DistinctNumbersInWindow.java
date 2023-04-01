package Month08_March.Day148_310323;

import java.util.HashMap;

public class DistinctNumbersInWindow {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 1, 3, 4, 3}, 3));
    }

    static int[] solve(int []A, int B){
        int ans[] = new int[A.length - B + 1];
        HashMap<Integer, Integer> set = new HashMap<>();

        for(int i = 0 ; i < B; i++){
            set.put(A[i], set.getOrDefault(A[i], 0) + 1);
        }

        ans[0] = set.size();

        for(int i = 1, j=B; i < A.length - B + 1 && j < A.length ; i++, j++){
            if(set.get(A[i - 1]) == 1){
                set.remove(A[i - 1]);
            }else{
                set.put(A[i-1], set.get(A[i - 1]) - 1);
            }
            set.put(A[j], set.getOrDefault(A[j], 0) + 1);
            ans[i] = set.size();
        }

        return ans;
    }
}
