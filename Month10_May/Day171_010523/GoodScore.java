package Month10_May.Day171_010523;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GoodScore {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{25, 36, 22, 20, 29, 36, 27, 24, 23, 20}, 36));
    }

    static int[] solve(int A[], int B){
        List<Integer> list1 = new ArrayList<>();

        Comparator<Integer> com = new Comparator<Integer>(){


            public int compare(Integer o1, Integer o2){
                return o1.compareTo(o2);
            }
        };

        List<Integer> list = new ArrayList<>();

        for(int i : A){
            list.add(i);
        }
        Collections.sort(list, com);

        int startIndex = 0;

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) >= B){
                startIndex = i;
                break;
            }
        }

        int ans[] = new int[A.length - startIndex];

        for(int i = 0; startIndex < list.size(); i++){
            ans[i] = startIndex++;
        }

        return startIndex == 0 ? new int[]{} : ans;
    }
}
