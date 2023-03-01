package Month08_March.Day119_010323;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllSubArrays {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(solve(list));
    }

    static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0;i < A.size(); i++){
            for(int j = i; j < A.size(); j++){
                ArrayList<Integer> inner = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    inner.add(A.get(k));
                }
                ans.add(inner);
            }
        }
        return ans;
    }
}
