package Backtracking;

import java.util.Arrays;
import java.util.Comparator;

public class TensDigitCompare {
    public static void main(String[] args) {
        Integer a[] = new Integer[]{909, 7, 11, 19, 21};


        Comparator com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                int a = o1 % 10 % 10;
                int b = o1 % 10 % 10;

                if(a == b){
                    return o1 - o2;
                }

                return a - b;
            }
        };

        Arrays.sort(a, com);

        System.out.println(a);

    }
}


class compare implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {

        int a = (o1 % 10);
        int b = (o2 % 10);

        if(a == b) return o1.compareTo(o2);

        return a - b;
    }
}