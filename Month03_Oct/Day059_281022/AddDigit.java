package gg.Month03_Oct.Day059_281022;

public class AddDigit {
    public static void main(String[] args) {
        System.out.println(addDigit(14));
    }

    static int addDigit(int num){
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));
    }
}
