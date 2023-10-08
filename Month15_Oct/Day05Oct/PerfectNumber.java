package Month15_Oct.Day05Oct;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(solve(4));;

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("1" + "21"));

    }

    static String solve(int A){
        Queue<String> q = new LinkedList<>();
        String ans = "";

        if(A == 1) return "11";
        if(A == 2) return "22";

        q.add("1");
        q.add("2");

        int k = 2;


        while(k < A){
            String temp = q.remove();

            q.add(temp + "1");
            k++;

            if(k == A){
                ans= (temp + "1");
            }

            q.add(temp + "2");
            k++;

            if(k == A){
                ans = (temp + "2");
            }

        }
        StringBuilder sb = new StringBuilder(ans);
        return (ans + sb.reverse());


    }
}
