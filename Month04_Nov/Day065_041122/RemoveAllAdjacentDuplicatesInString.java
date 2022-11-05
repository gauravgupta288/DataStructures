package Month04_Nov.Day065_041122;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(sol2UsingStack("azxxzy"));
    }

    static String removeAdjacentString(String s) {
        StringBuilder sb = new StringBuilder(s);

        int i = 1;
        while (i < sb.length()) {
            if (i > 0 && sb.charAt(i) == sb.charAt(i - 1)) {
                sb.replace(i - 1, i + 1, "");
                i--;
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    static String sol2UsingStack(String s) {
        Stack<Character> stack = new Stack<>();

        stack.push(s.charAt(0));
        int i = 1;
        while (i < s.length()) {
            if (!stack.empty()) {
                char ch1 = stack.pop();
                char ch2 = s.charAt(i);

                if (ch1 != ch2) {
                    stack.push(ch1);
                    stack.push(ch2);
                }
                i++;
            }else{
                stack.push(s.charAt(i++));
            }
        }

        return  stack.toString().replace("[", "").replace(",","").replace(" ", "").replace("]", "");
    }
}


