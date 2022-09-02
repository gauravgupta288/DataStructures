package gg.Month01_Aug.Day017_200822;

public class ListADT {

    Object arr[];
    int index = 0;

    ListADT() {
        arr = new Object[2];
    }

    public int getLen() {
        return index;
    }

    public void add(Object temp) {
        if (index == arr.length) {
            //Create a new array with size double of index size
            Object newArr[] = new Object[index * 2];

            //Copy all elements of older array to new array
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[index++] = temp;
    }

    public void removeByIndex(int idx) {
        if (idx > index) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = idx; i < index; i++) {
            arr[i] = arr[i+1];
        }
        index--;
    }

    public void printList() {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class List {
    public static void main(String[] args) {
        ListADT lADT = new ListADT();
        lADT.add("10");
        lADT.add("20");
        lADT.add("200");
        lADT.add("20");
        lADT.add("200");
        lADT.add("200");
        lADT.printList();
        lADT.removeByIndex(3);
        lADT.printList();
        System.out.println(lADT.getLen());

    }
}
