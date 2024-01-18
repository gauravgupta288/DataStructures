package Backtracking;

import java.util.PriorityQueue;

public class Heap {

    PriorityQueue<Integer> heap;
    int k;
    public Heap(int k, int[] nums) {
        heap = new PriorityQueue<>(k);
        this.k = k;
        for(int i : nums){
            if(heap.size() >= k){

                if(heap.peek() < i){
                    heap.poll();
                    heap.add(i);
                }
            }else{
                heap.add(i);
            }

        }
    }

    public int add(int val) {
        if(heap.size() >= k){

            if(heap.peek() < val){
                heap.poll();
                heap.add(val);
            }
        }else{
            heap.add(val);
        }

        return heap.peek();
    }
    public static void main(String[] args) {

        Heap kthLargest = new Heap(3, new int[]{4, 5, 8, 2});
        kthLargest.add(3);
        kthLargest.add(5);
        kthLargest.add(10);
        kthLargest.add(9);
        kthLargest.add(4);
    }
}
