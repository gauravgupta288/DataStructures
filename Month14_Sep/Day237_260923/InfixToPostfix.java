package Month14_Sep.Day237_260923;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        System.out.println(solve("x/(b+t)*g*(h-o)^s/(e-z)"));
    }

    public static String solve(String A) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : A.toCharArray()){

            if(ch == '*' || ch == '/'){

                while(!stack.isEmpty() && (stack.peek() == '^' || stack.peek() == '*' || stack.peek() == '/')){
                    sb.append(stack.pop());
                }

                stack.push(ch);

            }else if(ch == '+' || ch == '-'){
                while(!stack.isEmpty() && (stack.peek() == '^' || stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '+' || stack.peek() == '-')){
                    sb.append(stack.pop());
                }
                stack.push(ch);

            }else if(ch == ')'){
                while(!stack.isEmpty() && (stack.peek() != '(')){

                    sb.append(stack.pop());
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
                sb.append(ch);
            }
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
