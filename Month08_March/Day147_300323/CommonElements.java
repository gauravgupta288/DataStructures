package Month08_March.Day147_300323;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,2,1}, new int[]{2,2}));
    }

    static int[] solve(int[] A, int[] B){
        HashMap<Integer, Integer> set1 = new HashMap<>();
        HashMap<Integer, Integer> set2 = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i =0 ; i < A.length; i++){
            set1.put(A[i], set1.getOrDefault(A[i], 0) + 1);
        }

        for(int i =0 ; i < B.length; i++){
            set2.put(B[i], set2.getOrDefault(B[i], 0) + 1);
        }

        for(int i : set1.keySet()){
            if(set2.containsKey(i)){
                int n = Math.min(set1.get(i), set2.get(i));

                    arr.add(i);
            }

        }

        int ans[] = new int[arr.size()];

        for(int i = 0 ; i < ans.length; i++){
            ans[i] = arr.get(i);
        }

        return ans;
    }
}
