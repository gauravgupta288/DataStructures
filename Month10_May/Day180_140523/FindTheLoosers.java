package Month10_May.Day180_140523;

import java.util.ArrayList;
import java.util.List;

public class FindTheLoosers {
    public static void main(String[] args) {
        System.out.println(loosers(5, 2));
    }

    static int[] loosers(int n, int k) {
        int a[] = new int[n];

        List<Integer> list = new ArrayList<>();

        int z = k;
        for (int i = 0; k <= a.length; i++) {
            z = (i) + (z);
            a[ (z) % a.length]++;
            z *= 2;
            k++;
        }

        for(int i : a){
            if(i == 0){
                list.add(i);
            }
        }
        int ans[] = new int[list.size()];

        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}
