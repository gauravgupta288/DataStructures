package Month14_Sep.Day237_260923;

import java.util.Stack;

public class BasicCal {
    public static void main(String[] args) {
        System.out.println(calculate("(1+(4+5+2)-3)+(6+8)"));

    }

    public static int calculate(String A) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> sb = new Stack<>();
        int ans = 0;

        for(char ch : A.toCharArray()){

            if(ch == '*' || ch == '/'){

                while(!stack.isEmpty() && (stack.peek() == '^' || stack.peek() == '*' || stack.peek() == '/')){
                    sb.push(stack.pop());
                }

                stack.push(ch);

            }else if(ch == '+' || ch == '-'){
                while(!stack.isEmpty() && (stack.peek() == '^' || stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-')){
                    sb.push(stack.pop());
                }
                stack.push(ch);

            }else if(ch == ')'){
                while(!stack.isEmpty() && (stack.peek() != '(')){

                    sb.push(stack.pop());
                }
                if(stack.peek() == '('){
                    stack.pop();
                }
                if(ch != ')'){
                    stack.push(ch);
                }


            }else if(ch == '(' || ch == '^'){
                stack.push(ch);
            }
            else{
                sb.push(ch);
            }
        }

        while(!stack.isEmpty()){
            sb.push(stack.pop());
        }

        return ans;
    }
}
