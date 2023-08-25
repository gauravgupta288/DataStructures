package Month13_Aug.Day218_250823;

import java.util.PriorityQueue;

public class MostCompetitiveSequence {
    public static void main(String[] args) {
        mostCompetitive(new int[]{0,3,5,2,6,6}, 3);
    }

    public static int[] mostCompetitive(int[] nums, int k) {

        int ans[] = new int[k];

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i : nums){
            heap.add(i);
        }

        int index = 0;
        while(!heap.isEmpty() && index < k){
            ans[index++] = heap.poll();;
        }
        return ans;

    }
}
