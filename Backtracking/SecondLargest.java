package Backtracking;

import java.util.PriorityQueue;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = new int[]{1,3,4,2,5,6,6};

        PriorityQueue<Integer> queue =  new PriorityQueue<>(2);

        for(int i = 0; i < 2; i++){
            queue.add(arr[i]);
        }

        for(int i = 2; i < arr.length; i++){

            if(queue.peek() < arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }

        System.out.println(queue.peek());
    }
}
