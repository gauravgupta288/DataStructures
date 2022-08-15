package gg.Day011_140822;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class FindAllPairs {
    public static void main(String[] args) {
        System.out.print(allPairs(new long[]{1,2,4,5,7}, new long[]{5,6,3,4,8}, 5,5,9));
    }

    static pair[] allPairs(long A[], long B[], long N, long M, long X) {
        ArrayList<pair> list = new ArrayList<>();

        Set<Long> set = new HashSet<>();
        for (long i : B) {
            set.add(i);
        }
        int j = 0;
        for (long i : A) {
            if (set.contains(X - i)) {
                list.add(new pair(i, X - i));
            }
        }
        pair[] ans=new pair[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}
