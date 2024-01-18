package Backtracking;

import java.util.PriorityQueue;

public class KthLargestNumber {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int nums[] = {3,2,1,5,6,4};
        int k = 2;

        for(int i = 0; i < nums.length; i++){
            if(heap.size() >= k){

                if(heap.peek() < nums[i]){
                    heap.poll();
                    heap.add(nums[i]);
                }
            }else{
                heap.add(nums[i]);
            }
        }

        System.out.println(heap.peek());
    }
}
