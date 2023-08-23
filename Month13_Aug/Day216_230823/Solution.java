package Month13_Aug.Day216_230823;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();

        ArrayList<Integer> arr = new ArrayList<>();
        int a[] = new int[]{324,458,481,167,939,444,388,612,943,890,953,403,653,136,168,163,186,471};

        for(int i = 0; i < a.length; i++){
            arr.add(a[i]);
        }
        System.out.println(s.solve(arr, 231));
    }
    public int solve(ArrayList<Integer> A, int B) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : A){

            if(i <= B){
                minHeap.offer(i);
            }

        }

        int ans = 0;
        while(!minHeap.isEmpty()){

            int minCandies = minHeap.poll();

            if(minCandies/2 <= B){
                ans += minCandies /2;
            }

            if (!minHeap.isEmpty()) {
                int k = minHeap.poll();

                int val = k + (minCandies - minCandies/2);
                if(val <= B){
                    minHeap.add(val);
                }
            }


        }
        return ans;
    }
}
