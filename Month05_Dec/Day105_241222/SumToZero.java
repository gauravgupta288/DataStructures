package Month05_Dec.Day105_241222;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SumToZero {
    public static void main(String[] args) {
        ArrayList<Integer> lsit = new ArrayList<>();
        lsit.add(1);lsit.add(-1);lsit.add(3);lsit.add(4);
        System.out.println(sumZero(lsit));
    }
    
    static int sumZero(ArrayList<Integer> A){
        Set<Integer> set = new HashSet<>();
         for(int i : A){
            if(set.contains(-i)){
                return 1;
            }else{
                set.add(i);
            }
        }

        return 0;
    }
}
