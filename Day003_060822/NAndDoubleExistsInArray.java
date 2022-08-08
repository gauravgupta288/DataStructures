package gg.Day003_060822;

import java.util.HashSet;
import java.util.Set;

public class NAndDoubleExistsInArray {
    public static void main(String[] args) {
System.out.println(arrayAndDouble(new int[]{0,0}));
    }

    static boolean arrayAndDouble(int []arr){
        Set<Integer> set = new HashSet<>();

        for(int i=0,j=arr.length-1;i<=j;i++,j--){
            if(set.contains(arr[i]*2) || (arr[i]%2==0 && set.contains(arr[i]/2))){
                return true;
            } else if (set.contains(arr[j]*2) || (arr[j]%2==0 && set.contains(arr[j]/2))) {
                return true;
            }else if(arr[i]*2 == arr[j] || (arr[j]%2==0 && arr[i]/2==arr[j])){
                return true;
            }
            else {
                set.add(arr[j]);
                set.add(arr[i]);
            }
        }
        return false;
    }
}
