package Month04_Nov.Day082_241122;

public class Stack<T> {
    int size = 10;
    int pos = 0;
    Object[] arr;

    public Stack() {
        arr = new Object[size];
    }

    public T push(T item) {
        if (pos == size) {
            throw new ArrayIndexOutOfBoundsException("Array is full");
        } else {
            arr[pos++] = item;
        }
        return item;
    }

    public T pop() {
        return (T) arr[--pos];
    }

    public void print() {
        System.out.println("********** Values in array **********");
        for (int i=0; i < pos; i++) {
            System.out.println(arr[i]);
        }
    }

}
