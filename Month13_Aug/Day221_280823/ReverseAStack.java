package Month13_Aug.Day221_280823;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        st.push(1); st.push(2); st.push(3);

        reverse(st, ans);;

        System.out.println();
    }

    static void reverse(Stack st, Stack ans){
        if(st.size() == 0){
            return;
        }

        Object pe = st.pop();
        ans.push(pe);
        reverse(st, ans);

    }
}
