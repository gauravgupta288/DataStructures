package Month08_March.Day148_310323;

import java.util.HashSet;

public class CheckPairSum {
    public static void main(String[] args) {

    }

    static int solve(int A, int B[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i : B){
            if(set.contains(A - i)){
                return 1;
            }
            set.add(i);
        }

        return 0;
    }
}
