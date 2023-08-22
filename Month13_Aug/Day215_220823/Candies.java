package Month13_Aug.Day215_220823;

import java.util.ArrayList;

public class Candies {
    static int size = 0;
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();

        A.add(3); A.add(2); A.add(3);

        System.out.println(solve(A, 4));

    }


    public static int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans1 = new ArrayList<>();
        for(int i : A){
            push(ans1, i);
        }
        int ans = 0;
        while(size > 0){
            int toffy = pop(A);

            if(toffy > B){
                break;
            }

            if(toffy == 1){
                int temp = pop(A);
                push(ans1, temp + 1);
            }else{

                int x = (int)Math.floor(toffy / 2);

                int z = pop(A);

                ans += x;

                push(ans1, z + x);
            }
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
