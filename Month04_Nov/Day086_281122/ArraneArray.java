package Month04_Nov.Day086_281122;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraneArray {
    public static void main(String[] args) {
        arrangeArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1});
    }

    static int[] arrangeArray(int[] nums, int[] index){


        List<Integer> linkedList = new ArrayList<>();

        int z = 0;
        for(int i : index){
            linkedList.add(i, nums[z++] );
        }
        int i = 0;
        for(int k : linkedList){
            nums[i++] = k;
        }

        return nums;
    }
}

