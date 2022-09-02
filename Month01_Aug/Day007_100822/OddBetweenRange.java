package gg.Month01_Aug.Day007_100822;

public class OddBetweenRange {
    public static void main(String[] args) {
        System.out.println(countOdd(21,22));
    }

    static int countOdd(int low, int high) {
        int odds = (high - low) / 2 + low % 2 + high %2;
        return odds;
    }
}
