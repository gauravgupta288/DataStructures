package Month13_Aug.Day211_180823_Heap;

import java.util.ArrayList;

public class Heaps {
    static int size = 0;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(17);
        list.add(100);
        list.add(11);
        size = list.size();
        heapify(list);
        int ans = 0;

        while(size > 1){
            int first = pop(list);
            int second = pop(list);

            ans += first + second;
            list.set(size, first + second);
            size++;
            heapify(list);
        }


        System.out.println(ans);
    }

    public static void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    public static void heapify(ArrayList<Integer> A) {
        for (int i = size - 1; i >= 0; i--) {
            int parent = (i + 1) / 2 - 1;
            int index = i;
            while (parent >= 0 && A.get(index) < A.get(parent)) {
                swap(A, index, parent);
                index = parent;
                parent = (parent / 2) - 1;
            }
        }
    }

    public static int pop(ArrayList<Integer> A) {
        int ans = A.get(0);
        swap(A, 0, size - 1);
        size--;
        heapify(A);

        return ans;
    }
}
