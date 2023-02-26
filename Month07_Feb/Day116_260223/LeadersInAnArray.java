package Month07_Feb.Day116_260223;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{16, 17, 4, 3, 5, 2}));
    }

    public static int[] solve(int[] A){
        ArrayList<Integer> ans = new ArrayList<>();

        int max = A[A.length - 1];
        ans.add(max);

        for(int i = A.length - 1; i >= 0 ; i--){
            if(A[i] > max){
                max = A[i];
                ans.add(max);
            }
        }

        int []newa = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++){
            newa[i] = ans.get(i);
        }

        return newa;
    }
}
