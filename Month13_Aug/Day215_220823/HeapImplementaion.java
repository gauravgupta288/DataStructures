package Month13_Aug.Day215_220823;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HeapImplementaion {
    static ArrayList<Integer> arr;



    static int size;

    HeapImplementaion() {
        arr = new ArrayList<>();
        arr.add(-1);
        size = 0;
    }

    public void insert(int val) {


        size++;

        int index = size;

        arr.add(index, val);
        while (index > 1) {
            int parent = index / 2;

            if (arr.get(parent) < arr.get(index)) {
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

    public static void print() {
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

        while (index < size) {
            int left = 2 * index;
            int right = 2 * index + 1;
            if (left <= size && arr.get(left) > arr.get(index)){
                swap(left, index);
                index = left;
            }
            else if(right <= size && arr.get(right) > arr.get(index)){
                swap(right, index);
                index = right;
            }else{
                break;
            }
        }

        return popedElement;

    }

    public static void main(String s[]) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(20);
        pq.add(40);

        System.out.println(pq.poll());
        System.out.println(pq.poll());

        HeapImplementaion heap = new HeapImplementaion();

        heap.insert(10);
        heap.insert(100);
        heap.insert(12);
        heap.insert(12);
        heap.insert(120);
        heap.insert(10);
        print();

        System.out.println();
        System.out.println("Poped Element " + heap.pop());
        print();
    }
}
