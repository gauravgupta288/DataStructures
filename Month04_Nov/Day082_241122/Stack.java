package Month04_Nov.Day082_241122;

public class Stack {
    int size = 10;
    int pos = 0;
    int[] arr;

    public Stack() {
        arr = new int[size];
    }

    public int push(int item) {
        if (pos == size) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        } else {
            arr[pos++] = item;
        }
        return item;
    }

    public int pop() {
        System.out.println(pos);
        return arr[pos--];
    }

    public void print() {
        System.out.println("********** Values in array **********");
        for (int i=0; i < pos; i++) {
            System.out.println(arr[i]);
        }
    }

}
