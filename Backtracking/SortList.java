package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        list1.add(1);list1.add(2);list1.add(3);
        list2.add(0);list2.add(2);list2.add(3);

        ans.add(list1);
        ans.add(list2);
        ans.add(list3);

        Collections.sort(ans, new Comparator<List<Integer>>() {

            public int compare(List<Integer> o1, List<Integer> o2) {

                if(o1.size() == 0 || o2.size() == 0) return -1;
                // Sort the lists using the starting position (second element in the list)
                return o1.get(0).compareTo(o2.get(0));
            }
        });

        System.out.println(ans);
    }


}
