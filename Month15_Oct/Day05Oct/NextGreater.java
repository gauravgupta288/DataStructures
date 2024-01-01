package Month15_Oct.Day05Oct;

import java.util.*;

public class NextGreater {
    public static void main(String[] args) {
        System.out.println(maxGreater(12443322));
        nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});


    }

    static int maxGreater(int num){
        char []ch = Integer.toString(num).toCharArray();

        int n = ch.length - 2;
        int ans;

        int k = -1;
        for(int i = n; i >= 0; i--){
            if(ch[i] < ch[i + 1]){
                k = i;
                break;
            }
        }

        if(k == -1) return -1;
        int i = 0;
        for( i = n+1; i >=0; i--){
            if(ch[i] > ch[k]){
                char t = ch[i];
                ch[i] = ch[k];
                ch[k] = t;
                break;
            }
        }

        int e = n+1;
        int s = k+1;
        while(s < e){
            char t = ch[s];
            ch[s] = ch[e];
            ch[e] = t;
            s++;e--;
        }

        if(k == -1) return k;

        return Integer.parseInt(String.valueOf(ch));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {





        Stack<Integer> st = new Stack<>();
        int len = nums2.length;
        int ans[] = new int[len ];

        Map<Integer, Integer> map = new HashMap<>();


        List<Integer> list = new ArrayList<>();

        list.add(5); list.add(2); list.add(13); list.add(3); list.add(8);

        int max = list.get(list.size() - 1);

        for(int i = list.size() - 2; i >= 0; i--){
            if(max > list.get(i)){
                list.set(i, max);
            }else{
                max = list.get(i);
            }
        }
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
