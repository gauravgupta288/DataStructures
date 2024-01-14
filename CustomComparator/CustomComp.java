package CustomComparator;

import java.util.Arrays;
import java.util.Comparator;

public class CustomComp implements Comparator<Integer>{
    public static void main(String[] args) {


        Integer[] arr = {9,3,30,89,5};

        Arrays.sort(arr, new CustomComp());

        System.out.println(arr);


    }

    @Override
    public int compare(Integer o1, Integer o2) {
        String s1 = Integer.toString(o1);
        String s2 = Integer.toString(o2);

        return (s1 + s2).compareTo(s2 + s1);
    }
}
