package gg.Day006_090822;

public class SecondLargestInAArray {
    public static void main(String[] args) {

        System.out.println(secondLargest(new int[]{2,4,5,6,3,10,10,6,4,11}));
    }

    static int secondLargest(int a[]) {
        int f = a[0];
        int s = a[0];

        for (int i : a) {
            if (f < i) {
                s = f;
                f = i;
            } else if (s < i && i != f) {
                s = i;
            }
        }
        return s;
    }
}
