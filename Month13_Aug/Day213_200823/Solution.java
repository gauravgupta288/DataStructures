package Month13_Aug.Day213_200823;

import java.util.ArrayList;

public class Solution {
    static int size = 0;

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();

        A.add(6);
        A.add(19);
        A.add(9); A.add(14);A.add(17);A.add(16);A.add(7);A.add(2);
        A.add(14);A.add(4);A.add(3);

        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {

        // size = A.size();
        //heapify(A);
        int ans = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        //create min heap
        for(int i : A){
            push(arr, i);
        }
        size = getSize();
        while(size > 1){
            int first = pop(arr);
            //size--;
            int second = pop(arr);
            //size--;
            ans += first + second;
            push(arr, first + second);
            //size++;
        }

        return ans;
    }

    public static int getSize(){
        return size;
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

    public static int peak(ArrayList<Integer> arr){
        return arr.get(0);
    }
    public static int pop(ArrayList<Integer> arr){

        if (arr.size() == 0) {
            return -1;
        }
        int ans = arr.get(0);
        swap(arr, 0, size - 1);
        size--;

        if (size == 2) {
            if (arr.get(0) > arr.get(1)) {
                swap(arr, 0, 1);
            }
            return ans;
        }
        int parent = 0;
        int left = getLeft(parent);
        int right = getRight(parent);

        while (right < size) {
            // Compare left and right children to find the smaller one
            int smallerChild = (arr.get(left) < arr.get(right)) ? left : right;

            // If the parent is greater than the smaller child, swap and continue
            if (arr.get(parent) > arr.get(smallerChild)) {
                swap(arr, parent, smallerChild);
                parent = smallerChild;
                left = getLeft(parent);
                right = getRight(parent);
            } else {
                break;
            }
        }
        return ans;
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        if(i < 0 || j < 0){
            return;
        }
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
