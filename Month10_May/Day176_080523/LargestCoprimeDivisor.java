package Month10_May.Day176_080523;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestCoprimeDivisor {
    public static void main(String[] args) {
        System.out.println(cpFact(2, 3));
    }

    static public int cpFact(int A, int B) {
        List<Integer> ans = factor(A);

        for(int i = ans.size() - 1; i >= 0; i--){
            if(gcd(B, ans.get(i)) == 1){
                return ans.get(i);
            }
        }

        return -1;
    }

    static int gcd(int A, int B){
        if(A == 0){
            return B;
        }

        return gcd(B % A, A);
    }
    static List<Integer> factor(int A){
        List<Integer> ans = new ArrayList<>();

        for(int i = 1; i * i <= A; i++){
            if(A % i == 0){
                ans.add(i);
                ans.add(A / i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
