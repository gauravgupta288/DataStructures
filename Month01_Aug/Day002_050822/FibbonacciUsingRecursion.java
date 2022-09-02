package gg.Month01_Aug.Day002_050822;

public class FibbonacciUsingRecursion {
    public static void main(String[] args) {

    }

    static int fibbo(int n1, int n2){
        int i = 1;
        int j = 1;
        int res = i+j;
        System.out.println(res);
        return fibbo(res,j);
    }
}
