package Month15_Oct.Day05Oct;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNotRepetingChar {
    public static void main(String[] args) {
        System.out.println(solve("abcabc"));
    }

    static String solve(String A){
        StringBuilder sb = new StringBuilder();

        Queue<Character> q = new LinkedList<>();

        q.add(A.charAt(0));

        sb.append(A.charAt(0));

        for(int i = 1; i < A.length(); i++){
            char ch = A.charAt(i);

            if(!q.isEmpty() && q.peek() == ch){
                q.poll();
            }else {
                q.add(ch);
            }
            if (q.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(q.peek());
            }
        }

        return sb.toString();
    }
}

