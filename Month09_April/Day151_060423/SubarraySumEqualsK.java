package Month09_April.Day151_060423;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {


        String str = "gaurav";
        String str1 = "gaurav";

        String str2 = new String("gaurav");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }

     int solve(int A[], int B){
        HashMap<Long, Integer> map = new HashMap<>();
        int count = 0;

        map.put((long)A[0], 1);
        long sum = A[0];

        if(sum == B){
            count++;
        }

        for(int i = 1; i < A.length; i++){
            sum += A[i];

            if(sum == B){
                count++;
            } if(map.containsKey(sum - B)){
                count += map.get(sum - B);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    static double fun(int n){
        if (n % 2 ==0){
            return 0;
        }
        return fun(n - 1) + fun((int) Math.floor(n/2));
    }
}
