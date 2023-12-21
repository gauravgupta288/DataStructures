package Month15_Oct.Day05Oct;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        int len = nums2.length;
        int ans[] = new int[len ];

        Map<Integer, Integer> map = new HashMap<>();


        for(int i = len -1 ; i >= 0; i--){

            while(!st.isEmpty() && st.peek() < nums2[i]){
                st.pop();
            }

            if(st.isEmpty()){
                map.put(nums2[i], -1);
            }else{
                map.put(nums2[i], st.peek());
            }

            st.push(nums2[i]);
        }

        for(int i = 0; i < nums1.length; i++){

            ans[i] = map.get(nums1[i]);

        }

        return ans;
    }
}
