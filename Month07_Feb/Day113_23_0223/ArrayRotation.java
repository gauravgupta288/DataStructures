package Month07_Feb.Day113_23_0223;

public class ArrayRotation {
    public static void main(String[] args) {
        int []A = {1, 1, 4, 9, 4, 7, 1};
        int B = 9;
        swap(A, 0, A.length-1);
        swap(A, 0, (B)%A.length == 0 ? 0 : (B-1)%A.length);
        swap(A, B%A.length, A.length-1);

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
