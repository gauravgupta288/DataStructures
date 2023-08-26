package Month13_Aug.Day219_260823_Recurtion;

import java.util.Collections;
import java.util.PriorityQueue;

public class FarthestBuilding {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4,12,2,7,3,18,20,3,19}, 10, 2));
    }

    static int solve(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i < heights.length; i++) {
            int diff = heights[i] - heights[i - 1];

            if(diff <= 0){
                continue;
            }
            bricks -= diff;
            heap.add(diff);

            if (bricks < 0) {
                bricks += heap.poll();

                if (ladders > 0) {
                    ladders--;
                }else{
                    return --i;
                }
            }
        }
        return heights.length - 1;
    }
}
