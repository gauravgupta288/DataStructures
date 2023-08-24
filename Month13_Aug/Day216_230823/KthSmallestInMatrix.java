package Month13_Aug.Day216_230823;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestInMatrix {
    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[][]{{1,2}, {1,3}}, 4));
    }

    public static int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;
        int m = matrix[0].length;

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        int len = 0;

        int i = 0;
        int j = 0;
        for(; i < n; i++){
            j = 0;
            for(; j < m;j++){
                heap.add(matrix[i][j]);
                len++;
                if(len == k){
                    j++;
                    break;
                }
            }
            if(len == k){
                break;
            }
        }

        int x = j == m ? 0 : j;
        if(i == n-1 && j == m){
            return heap.peek();
        }
        for(; i < n; i++){
             j = 0;
            for(; x < m;x++){

                if(matrix[i][x] < heap.peek()){
                    heap.poll();
                    heap.add(matrix[i][x] );
                }
            }
            x = 0;
        }

        return heap.peek();
    }
}
