package gg.Archived;

public class NumberOfBit {
    public static void main(String s[]) {
        System.out.println(numberOfBit1(000000000000000000000000000010111));
    }

    static int numberOfBit1(int n) {
        int count = 0;

        while (n != 0) {
            count+=(n&1);
            n=n>>>1;
        }

        return count;
    }
}
