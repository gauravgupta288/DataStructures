package Backtracking;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findOccerences {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,2,3,1,1,3, 4);

        Collections.sort(list);

        for(int i = 0; i < list.size() ; i++){
            int occur = 1;

            while(i < list.size() - 1 && list.get(i) == list.get(i + 1)){
                occur++;
                i++;
            }

            System.out.println(list.get(i) + " occurs " + occur + " times");
        }
    }
}
