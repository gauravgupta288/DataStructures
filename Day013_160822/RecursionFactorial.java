package gg.Day013_160822;

public class RecursionFactorial {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
    static int fact(int n){
        if(n==0)return 1;

        return fact(n-1)*n;
    }
}
