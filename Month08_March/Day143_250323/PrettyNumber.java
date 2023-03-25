package Month08_March.Day143_250323;

import java.util.ArrayList;
import java.util.List;

public class PrettyNumber {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3,3,6,3}));
    }

    static int[] solve(int[] A){
        List<Integer> list = new ArrayList<>();
        int n = A.length;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(A[i] < min){
                smin = min;
                min = A[i];
            }else if(smin > A[i]){
                smin = A[i];
            }
        }

        for(int i : A){
            if(i > smin){
                list.add(i);
            }
        }

        int ans[] = new int[list.size()];

        int k =0;
        for(int i : list){
            ans[k++] = i;
        }

        return ans;
    }
}
