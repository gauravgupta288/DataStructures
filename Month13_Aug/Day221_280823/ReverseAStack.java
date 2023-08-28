package Month13_Aug.Day221_280823;

import java.util.Stack;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ans = new Stack<>();
        st.push(1); st.push(10); st.push(3);

        reverse(st);;

        System.out.println();
    }

    static void reverse(Stack st){
        if(st.size() == 1){
            return;
        }

        Object pe = st.pop();
        reverse(st);
        insert(st, pe);
        return;

    }

    static void insert(Stack s, Object t){
        if(s.size() == 0){
            s.push(t);
            return;
        }

        Object pop = s.pop();
        insert(s, t);
        s.push(pop);
        return ;
    }
}
