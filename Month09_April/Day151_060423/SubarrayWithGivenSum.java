package Month09_April.Day151_060423;

import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4, 5, 6}, 6));
    }

    static int[] solve(int[] A, int B){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = A[0];
        map.put(A[0], 0);
        for(int i = 1; i < A.length; i++){
            sum += A[i];

            if(sum == B){
                int start = 0;
                int end = i;
                while(start <= end){
                    ans.add(A[start++]);
                }
                break;
            }
            if(map.containsKey(sum - B)){
                int start = map.get(sum - B) + 1;

                int end = i;
                int k = 0;
                while(start <= end){
                    ans.add(A[start++]);
                }
                break;
            }
            else{
                map.put(sum, i);
            }
        }
        int newans[] = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            newans[i] = ans.get(i);
        }
        return  ans.size() == 0 ? new int[]{-1} : newans;
    }
}
