package Month07_Feb.Day112_220223;

import java.util.HashSet;
import java.util.Set;

public class GoodPair {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};

        fun(arr);

        System.out.println(arr[3]);
    }

    public int solve(int[] A, int B) {

        Set<Integer> set = new HashSet<>();

        for(int i : A){
            if(set.contains(B - i)){
                return 1;
            }else{
                set.add(i);
            }
        }

        return 0;
    }

    static void fun(int[]arr) {

        arr[3] = 98;

        return;

    }
}
