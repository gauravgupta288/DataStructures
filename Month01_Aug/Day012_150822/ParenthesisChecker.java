package gg.Month01_Aug.Day012_150822;

import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        System.out.print(parenthesisChecker("[()]{}]"));
    }

    static boolean parenthesisChecker(String x) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(x.charAt(i));
            } else {
                if (st.empty()) return false;
                char temp = st.pop();
                if (ch == '}') {
                    if (temp != '{') {
                        return false;
                    }
                } else if (ch == ']') {
                    if (temp != '[') {
                        return false;
                    }
                } else if (ch == ')') {
                    if (temp != '(') {
                        return false;
                    }
                }
            }
        }
        return st.empty() ? true : false;
    }
}
