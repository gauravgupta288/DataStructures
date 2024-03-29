package gg.Month01_Aug.Day010_130822;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TripletInAArray {
    public static void main(String[] args) {
        System.out.println(triplet(new int[]{1, 2, 2, 1,}, 4, 3));
    }

    static boolean triplet(int A[], int n, int X) {
        for (int i = 0; i < n; i++) {
            Set<Integer> list = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int num = X - A[j] - A[i];
                if (list.contains(num)) {
                    return true;
                }
                list.add(A[j]);
            }
        }
        return false;
    }
}
