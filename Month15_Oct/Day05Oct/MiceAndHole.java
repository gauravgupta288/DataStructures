package Month15_Oct.Day05Oct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MiceAndHole {
    public static void main(String[] args) {

        int a[] = {1,3,2,4,5};
        int b[] = {10,5,4,3,5};
        System.out.println(mice(new ArrayList<>(Arrays.asList(-4, 2, 3)), new ArrayList<>(Arrays.asList(0, -2, 4))));
    }

    public static int mice(ArrayList<Integer> A, ArrayList<Integer> B) {

        Collections.sort(A);
        Collections.sort(B);
        int sum = 0;

        for(int i = 0; i < A.size(); i++){
            int s = Math.abs(A.get(i) - B.get(i));
            sum = Math.max(sum, s);
        }

        return sum;
    }
}
