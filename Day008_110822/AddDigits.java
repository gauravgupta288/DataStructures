package gg.Day008_110822;

public class AddDigits {
    public static void main(String[] args) {
        System.out.print(addDigit(381));
    }

    static int addDigit(int n) {
        int sum = 0;

        while (n!=0) {
            sum += n % 10;
            n /= 10;
        }
        if(sum<10)return sum;
        else addDigit(sum);

        return sum;
    }
}
