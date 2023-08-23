package Month13_Aug.Day215_220823;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    int size = 0;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Solution s = new Solution();
        ArrayList<Integer> arr1 = new ArrayList<>();

        arr.add(-1);
        arr1.add(324); arr1.add(458); arr1.add(481);
        arr1.add(167); arr1.add(939); arr1.add(444);
        arr1.add(388); arr1.add(612); arr1.add(943);
        arr1.add(890); arr1.add(953); arr1.add(403);
        arr1.add(653); arr1.add(136); arr1.add(168);
        arr1.add(163); arr1.add(186); arr1.add(471);
        System.out.println(s.solve(arr1, 231));
    }

    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : A){
            pq.add(i);
        }

        int i = 0;
        int ans = 0;
        while(i < pq.size()){

            int pe = pq.poll();

            if(pe > B){
                break;
            }

            if(pe == 1){
                if(size != 1){
                    int ne = pq.poll();
                    pq.add(ne+1);
                }
            }else{
                int r = Math.abs(pe / 2);

                ans += r;
                int ne = pq.poll();
                pq.add(ne+ (pe - r));
            }
            i++;
        }
        return ans;
    }

    public void insert(int val) {
        size++;
        int index = size;

        arr.add(index, val);
        while (index > 1) {
            int parent = index / 2;

            if (arr.get(parent) > arr.get(index)) {
                swap(parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }

    public void swap(int index1, int index2) {
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public int pop() {
        if (size == 0) {
            return -1;
        }
        int popedElement = arr.get(1);
        arr.set(1, arr.get(size));
        size--;

        int index = 1;

        while (index <= size) {
            int left = 2 * index;
            int right = 2 * index + 1;
            if (left <= size && arr.get(left) < arr.get(index)){
                swap(left, index);
                index = left;
            }
            else if(right <= size && arr.get(right) < arr.get(index)){
                swap(right, index);
                index = right;
            }else{
                break;
            }
        }

        return popedElement;

    }
}

