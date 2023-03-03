package Month08_March.Day120_020323;

import java.util.ArrayList;

public class AlternatingSubArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1}, 1));
    }

    static int[] solve(int[] A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;
        for (int i = B; i < A.length - B; i++) {
            flag = true;
            for (int j = i - B; j < i + B; j++) {
                if(j < A.length - 1){
                    if(A[j] == A[j + 1]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag ){
                list.add(i);
            }
        }
        int []ans = new int[list.size()];
        for(int i = 0; i <  list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
