package JavaConcepets;

import java.util.HashSet;
import java.util.Set;

public class LongestSub {
    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[]{4,5,6,4,7,7,8,10}));
    }

    public static int maximumUniqueSubarray(int[] n) {
        int i=0,j=0,sum=0,ans=0,len=n.length;

        Set<Integer> nm=new HashSet<>();

        for(int l = 0;l<len;l++){
            nm.add(l);
        }
        while(i < len && j < len)
        {
            if(!nm.contains(n[j]))
            {
                sum += n[j];
                ans = Math.max(ans,sum);
                nm.add(n[j++]);
            }
            else
            {
                sum -= n[i];
                nm.remove(n[i++]);
            }
        }
        return ans;
    }
}
