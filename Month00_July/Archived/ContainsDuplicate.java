package gg.Month00_July.Archived;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String str[]){
        System.out.println(findDuplicateSol2(new int[]{1,2,3,2,4,5}));
    }
    static boolean findDuplicateSol1(int []arr){
        ArrayList<Integer> arrL = new ArrayList<>();

        for(int i=0;i< arr.length;i++){
            if(arrL.contains(arr[i]))return true;
            else arrL.add(arr[i]);
        }
        return false;
    }
    static boolean findDuplicateSol2(int []arr){
        Set<Integer> arrL = new HashSet<>();

        for(int i=0;i< arr.length;i++){
            if(arrL.contains(arr[i]))return true;
            else arrL.add(arr[i]);
        }
        return false;
    }
}
