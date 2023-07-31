package Month12_July.Day195_310723;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("5");
        list.add("1");
        list.add("2");
        list.add("+");
        list.add("4");
        list.add("*");
        list.add("+");
        list.add("3");
        list.add("-");

        System.out.println(solve(list));
    }

    public static int solve(ArrayList<String> A) {
        Stack<String> st = new Stack<>();

        for (String s : A) {

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                String a = st.pop();
                String b = st.pop();

                st.push(Integer.toString(eval(Integer.parseInt(a), Integer.parseInt(b), s)));
            }else{
                st.push(s);
            }
        }



        return Integer.parseInt(st.pop());

    }

    static int eval(Integer a, Integer b, String ope) {
        if (ope.equals("+")) {
            return a + b;
        } else if (ope.equals("-")) {
            return b - a;
        } else if (ope.equals("*")) {
            return a * b;
        } else if (ope.equals("/")) {
            return a / b;
        } else {
            return -1;
        }
    }
}
