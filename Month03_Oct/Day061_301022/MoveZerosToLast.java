package Month03_Oct.Day061_301022;

public class MoveZerosToLast {
    public static void main(String[] args) {
        moveZero(new int[]{0, 1, 0, 3, 12});

    }

    static void moveZero(int[] arr) {

        int k = 0;
        int zc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k++] = arr[i];
            } else {
                zc++;
            }
        }
        while(k< arr.length){
            arr[k++] = 0;
        }
    }
}
