package gg.Day010_130822;

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        leader(new int[]{16,17,6,5,10,2}, 6);
    }

    static ArrayList<Integer> leader(int a[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n == 1) {
            list.add(a[0]);
            return list;
        }
        int max = a[n - 1];
        list.add(a[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if(a[i]>=max){
                list.add(0, a[i]);
                max = a[i];
            }
        }
        return list;
    }
}
