package gg.Day025_280822;

import java.util.Arrays;
import java.util.Stack;

public class RemoveStarFromString {
    public static void main(String[] args) {
        System.out.println(removeStar("leet**cod*e"));
    }

    static String removeStar(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        char ch[] = s.toCharArray();

        for (char c : ch) {
            if (c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        while (!stack.empty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
