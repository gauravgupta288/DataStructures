package Month14_Sep.Day237_250923;

import java.util.ArrayList;
import java.util.Stack;

public class BasicCal {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("2");a.add("1");a.add("+");a.add("3");a.add("*");

        System.out.println(evalRPN(a));
    }

    public static int evalRPN(ArrayList<String> A) {

        Stack<Integer> stack = new Stack<>();


        for(String s : A){
            int temp = 0;
            if(s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*")){
                int a = stack.pop();
                int b = stack.pop();
                int ans = calculate(b, a, s);
                stack.push(ans);
            }else {
                stack.push(Integer.parseInt(s));
            }

        }

        return stack.pop();
    }

    public static int calculate(int a, int b, String s){
        switch(s){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
        }

        return -1;
    }
}
