package Month12_July.Day195_310723;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        System.out.println(solve(")))))"));
    }

    public static int solve(String s) {

        if(s.length() == 1){
            return 0;
        }
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){


            if(ch == ')'){

                if(st.isEmpty()){
                    return 0;
                }
                char temp;
                if(st.pop() != '('){
                    return 0;
                }



            }else if(ch == '}'){
                if(st.isEmpty()){
                    return 0;
                }
                if(st.pop() != '{'){
                    return 0;
                }


            }else if(ch == ']'){
                if(st.isEmpty()){
                    return 0;
                }
                if(st.pop() != '['){
                    return 0;
                }


            }else{
                st.push(ch);
            }


        }
        return st.size() == 0 ? 1 : 0;
    }
}
