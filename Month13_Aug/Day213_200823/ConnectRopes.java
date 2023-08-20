package Month13_Aug.Day213_200823;

import Month13_Aug.Day212_190823_Heap_problems.Heap;

import java.util.ArrayList;

public class ConnectRopes {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();

        A.add(5);
        A.add(17);
        A.add(100); A.add(11);

        int size = 0;
        //heapify(A);
        int ans = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        //create min heap
        for(int i : A){
            Heap.push(arr, i);
        }
        size = Heap.getSize();
        while(size > 1){
            int first = Heap.pop(arr);
            size--;
            int second = Heap.pop(arr);
            size--;
            ans += first + second;
            Heap.push(arr, first + second);
            size++;
        }

        System.out.println(ans);
    }
}
