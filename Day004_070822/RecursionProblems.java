package gg.Day004_070822;

public class RecursionProblems {
    public static void main(String[] args) {
        printNameNtime(5);
        printNto1BT(1, 10);
    }
    static void printNameNtime(int n){
        if(n<1)return;

        System.out.println("Bunny");
        printNameNtime(n - 1);
    }

    static void printNto1(int n){
        if(n<1)return;

        System.out.println(n);
        printNto1(n-1);
    }

    static void print1ToN(int n){
        if(n<1)return;

        print1ToN(n-1);
        System.out.println(n);
    }
    static void printNto1BT(int i, int n){
        if(i>n)return;

        printNto1BT(i+1, n);
        System.out.println(i);
    }
}
