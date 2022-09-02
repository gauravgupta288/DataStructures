package gg.Month01_Aug.Day011_140822;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SwappingPair {
    public static void main(String[] args) {

    }

    static long swappingPair(long A[], int n, long B[], int m) {
        int sum1 = 0;
        int sum2 = 0;
        long pair = -1;
        Arrays.sort(A);
        Arrays.sort(B);

        Set<Long> set1 = new HashSet<>();
        Set<Long> set2 = new HashSet<>();

        for (long i : A) {
            sum1 += i;
            set1.add(i);
        }
        for (long i : B) {
            sum2 += i;
            set2.add(i);
        }

        for (int i = 0; i < n && i < m; i++) {
            long num;
            if(sum1>sum2){
                num = A[i];
                long total = sum2 + num;

//                if(set1.contains(total - ))
//                long total2 = sum1 - num;
            }else{
                num = B[i];
                long total = sum1 + num;
                long total2 = sum2 - num;
            }


        }
        return pair;
    }
}
