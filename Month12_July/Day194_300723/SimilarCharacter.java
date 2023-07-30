package Month12_July.Day194_300723;

import java.util.Stack;

public class SimilarCharacter {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();


        for(char ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }

            else if(ch == stack.peek()){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            char c = stack.pop();
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}
