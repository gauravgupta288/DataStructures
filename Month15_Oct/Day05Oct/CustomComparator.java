package Month15_Oct.Day05Oct;

import java.util.*;

public class CustomComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return Integer.compare(o1[0], o2[0]);
    }
}


class GreedyAlgo{
    public static int solve(int[][] events){
        int count = 0;
        int day = 1;

        Set<Integer> set = new TreeSet<>();



        Arrays.sort(events, new CustomComparator());

        for(int i = 0; i < events.length; i++){
            if(events[i][0] <= day && events[i][1] >= day){
                count++;
                day++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = solve(new int[][]{{1,2}, {2,3},{3,4},{1,2}});

        System.out.println(ans);

        List<Integer> list1 = new ArrayList<>(List.of(1, 3, 2, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(5, 3, 4, 2, 1));


        // Create a comparator based on the order of elements in list1
        Comparator<Integer> customComparator = Comparator.comparingInt(list1::indexOf);

        // Sort list2 using the custom comparator
        Collections.sort(list2, customComparator);

        System.out.println(list1);
        System.out.println(list2);
    }
}