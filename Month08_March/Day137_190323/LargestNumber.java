package Month08_March.Day137_190323;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {


    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 30, 34, 5, 9,908}));
        compare(9, 90);
    }

    static String solve(int[] A){

        StringBuilder sb = new StringBuilder();
        String[] str =  new String[A.length];
        for(int i = 0; i < A.length; i++){
            str[i] = Integer.toString(A[i]);
        }

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s = Integer.toString(o1);
                String t = Integer.toString(o2);

                return (t + s).compareTo(s + t);
            }
        };
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            list.add(A[i]);
        }
        Collections.sort(list, com);
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    static int compare(int A, int B){

        String s = Integer.toString(A);
        String t = Integer.toString(B);

        return (s + t).compareTo(t + s);
    }
}
