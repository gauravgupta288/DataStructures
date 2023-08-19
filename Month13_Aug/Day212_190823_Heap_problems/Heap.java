package Month13_Aug.Day212_190823_Heap_problems;

public class Heap {
    static int size = 0;

    public static void main(String[] args) {
        int[][] list = new int[][]{
                {1,2,4}, {3,3,1}
        } ;
        size = list[0].length;
        int ans = 0;

        for(int i = 0; i < list.length; i++){
            int max = list[i][0];

            while(size > 1){
                int first = pop(list[i]);

                max = Math.max(first, max);
                heapify(list[i]);
            }

            ans += max;
        }
        System.out.println(ans);
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void heapify(int[] A) {
        for (int i = size - 1; i >= 0; i--) {
            int parent = (i + 1) / 2 - 1;
            int index = i;
            while (parent >= 0 && A[index] > A[parent]) {
                swap(A, index, parent);
                index = parent;
                parent = (parent / 2) - 1;
            }
        }
    }

    public static int pop(int[] A) {
        int ans = A[0];
        swap(A, 0, size - 1);
        size--;
        heapify(A);

        return ans;
    }
}
