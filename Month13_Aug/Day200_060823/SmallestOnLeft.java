package Month13_Aug.Day200_060823;

import java.util.Stack;

public class SmallestOnLeft {

    public static void main(String s[]){
        prevSmaller(new int[]{39,27,11,4,24,32,32,1});
    }

    static int[] prevSmaller(int[] A) {

        Stack<Integer> st = new Stack<>();
        int n = A.length;
        int ans[] = new int[n];

        ans[0] = -1;
        st.push(A[0]);
        for(int i = 1; i < n; i++){
            if(A[i] > st.peek()){
                ans[i] = st.peek();
            }else{
                while(!st.isEmpty() && A[i] <= st.peek()){
                    st.pop();
                }

                if(st.isEmpty()){
                    ans[i] = -1;
                }else{
                    ans[i] = st.peek();
                }
            }

            st.push(A[i]);
        }

        return ans;
    }
}
