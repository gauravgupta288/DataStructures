package Month14_Sep.Day238_300923;

import java.util.Stack;

public class LargestHisto {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

    public static int largestRectangleArea(int[] A) {

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();

        int left[] = new int[A.length];
        int right[] = new int[A.length];

        left[0] = -1;
        st.push(0);

        for(int i = 1; i < A.length; i++){

            int index = st.peek();
            if(A[i] > A[index]){
                left[i] = index;
            }
            else{
                while(!st.isEmpty() && A[st.peek()] >= A[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    left[i] = -1;
                }else{
                    left[i] = st.peek();
                }
            }
            st.push(i);
        }

        right[A.length - 1] = A.length;

        st1.push(A.length-1);

        for(int i = A.length - 2; i >=0; i--){

            int index = st1.peek();
            if(A[i] > A[index]){
                right[i] = index;
            }

            else{
                while(!st1.isEmpty() &&  A[st1.peek()] >= A[i]){
                    st1.pop();
                }
                if(st1.isEmpty()){
                    right[i] = A.length;
                }else{
                    right[i] = st1.peek();

                }
            }
            st1.push(i);
        }

        int ans = 0;
        for(int i = 0; i < A.length; i++){

            ans = Math.max(ans, A[i] * (right[i] - left[i] - 1));

        }

        return ans;
    }
}
