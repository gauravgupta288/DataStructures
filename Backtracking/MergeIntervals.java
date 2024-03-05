package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        System.out.println(merge(new int[][]{{1,4}, {0,4}}));
    }

    public static  int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(0, List.of(Integer.valueOf(intervals[0][0]), Integer.valueOf(intervals[0][1])));

        for(int i = 1; i < intervals.length; i++){
            int a[] = intervals[i]; // a = [2,6]
            List<Integer> list = new ArrayList<>();

            if(a[0] <= ans.get(ans.size() - 1).get(1)){//intervals = [1, 3]

                if(a[0] < ans.get(ans.size() - 1).get(0)){
                    ans.set(i - 1, List.of(a[0], a[1]));
                }else{
                    ans.set(i - 1, List.of(ans.get(i - 1).get(0), a[1]));
                }
            }else{

                List<Integer> list1 = new ArrayList<>();
                list1.add(a[0]);
                list1.add(a[1]);
                ans.add(list1);
            }
        }

        int finalAns[][] = new int[ans.size()][2];
        for(int i = 0; i < ans.size(); i++){
            finalAns[i][0] = ans.get(i).get(0);
            finalAns[i][1] = ans.get(i).get(1);
        }

        return finalAns;
    }
}
