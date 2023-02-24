package Month07_Feb.Day113_230223;

public class ArrayRotation {
    public static void main(String[] args) {
        int []A = {1, 1, 4, 9, 4, 7, 1};
        int B = 14;

        B %= A.length;
        swap(A, 0, A.length-1);
        swap(A, 0, B - 1);
        swap(A, B, A.length-1);

        System.out.println(A);
    }

    public static void swap(int []A, int start, int end){
        while(start < end){
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            end--;
            start++;
        }
    }
}
