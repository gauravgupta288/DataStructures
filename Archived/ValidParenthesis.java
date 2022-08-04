package gg.Archived;

import java.util.ArrayList;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String s[]) {
        System.out.println(validParenthesisSol2("[{()}]"));
    }

    static boolean validParenthesis(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                if (i != s.length() - 1 && s.charAt(i + 1) == ')') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            } else if (s.charAt(i) == '{') {
                if (i != s.length() - 1 && s.charAt(i + 1) == '}') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            } else if (s.charAt(i) == '[') {
                if (i != s.length() - 1 && s.charAt(i + 1) == ']') {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    static boolean validParenthesisSol1(String s) {
        boolean flag = false;
        ArrayList<Character> al = new ArrayList<>();
        int ali = -1;
        int n=s.length()-1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(n) == '(' || s.charAt(n) == '{' || s.charAt(n) == '[') {
                return false;
            } else if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                al.add(s.charAt(i));
                ali++;
            } else if (s.charAt(i) == ')') {
                if (al.size() !=0 && al.get(ali).equals('(')) {
                    al.remove(ali--);
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            } else if (s.charAt(i) == ']') {
                if (al.size() !=0 &&  al.get(ali).equals('[')) {
                    al.remove(ali--);
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            } else if (s.charAt(i) == '}') {
                if (al.size() !=0 && al.get(ali).equals('{')) {
                    al.remove(ali--);
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }

        if(al.size() != 0)return false;
        return flag;
    }

    static boolean validParenthesisSol2(String s){
        Stack<Character> ch = new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('){
                ch.push(')');
            }else if(c=='{'){
                ch.push('}');
            } else if (c=='[') {
                ch.push(']');
            } else if (ch.empty() || ch.pop() != c) {
                return false;
            }
        }
        return ch.empty();
    }
}
