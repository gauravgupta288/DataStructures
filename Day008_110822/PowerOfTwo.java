package gg.Day008_110822;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwoSol3(10));
    }

    static boolean powerOfTwo(int n) {
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        while (n > 2) {
            n = n / 2;
            if (n % 2 != 0) return false;
            if (n == 2 && n % 2 == 0) {
                break;
            }
        }

        return n == 2 ? true : false;
    }

    static boolean powerOfTwoSol2(int n) {

        return n > 0 && (n & n - 1) == 0;
    }

    static boolean powerOfTwoSol3(int n) {
        if(n==2){
            return true;
        }
        if(n%2!=0) return false;
        return powerOfTwoSol3(n/2);
    }
}
