package Month10_May.Day177_100523;

import java.util.ArrayList;
import java.util.List;

public class FindAllPrimes {
    public static void main(String[] args) {
        System.out.println(allPrimes(25));
    }

    static int[] allPrimes(int A) {
        int ans[] = new int[A + 1];

        ans[0] = 1;
        ans[1] = 1;
        for (int i = 2; i * i <= A; i++) {
            if (ans[i] == 0) {
                for (int j = i * i; j <= A; j += i) {
                    ans[j] = 1;
                }
            }
        }
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < ans.length; i++){
            if(ans[i] == 0){
                list.add(i);
            }
        }
        int a[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            a[i] = list.get(i);
        }
        return a;
    }
}
