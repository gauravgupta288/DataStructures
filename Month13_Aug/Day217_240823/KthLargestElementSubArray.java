package Month13_Aug.Day217_240823;

import java.util.PriorityQueue;

public class KthLargestElementSubArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{10, -10, 20, -40}, 6));
    }

    public static int solve(int arr[], int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int size = 0;
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                if(i == j){
                    sum += arr[i];

                }else{
                    sum += arr[j];
                }
                size++;
                heap.add(sum);

                if(size > k){
                    heap.poll();
                }
            }
        }


        return heap.peek();
    }
}
