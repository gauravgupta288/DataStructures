package Month13_Aug.Day212_190823_Heap_problems;

import java.util.ArrayList;

public class Heap {
    static int size = 0;
    int capacity = 10;
    int arr[] = new int[capacity];

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        push(arr, 5);
        push(arr, 4);
        push(arr, 2);
        push(arr, 10);
        push(arr, 12);
        push(arr, 0);

        pop(arr);
        pop(arr);
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public static void heapify(int[] A) {

    }

    public static int getParent(int index){
          return ((index - 1) / 2);
    }
    //TC - O(Logn) to insert a value
    public static void push(ArrayList<Integer> arr, int val){

        arr.add(size, val);
        int cur = size;
        int parent = (size - 1) / 2;
        while(parent >= 0 && arr.get(parent) > arr.get(cur)){
            swap(arr, parent, cur);
            cur = parent;
            parent = getParent(parent);

        }
        size++;
    }

    public static int getLeft(int index){
        return index * 2 + 1;
    }

    public static int getRight(int index){
        return index * 2 + 1 + 1;
    }

    public static int getSize(){
        return size;
    }
    public static int pop(ArrayList<Integer> arr){

        if(arr.size() == 0){
            return -1;
        }
        int ans = arr.get(0);
        swap(arr, 0, size - 1);
        size--;

        if(size == 2){
            if(arr.get(0) > arr.get(1)){
                swap(arr, 0, 1);
            }
            return ans;
        }
        int parent = 0;
        int left = getLeft(parent);
        int right = getRight(parent);

        while(right < size){
            //if left child is smaller
            if(arr.get(parent) > arr.get(left) && arr.get(left) < arr.get(right)){
                swap(arr, parent, left);
                parent = left;
            }

            // if right child is smaller
            else if(arr.get(parent) > arr.get(right) && arr.get(right) < arr.get(left)){
                swap(arr, parent, right);
                parent = right;
            }

            left = getLeft(parent);
            right = getRight(parent);
        }
        return ans;
    }

}
