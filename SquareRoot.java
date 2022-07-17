package gg;

public class SquareRoot {
    public static void main(String s[]){
        System.out.println("Square root "+sqrt( Integer.MAX_VALUE));
    }
    static long sqrt(int x){
        if(x==0)return 0;

        int e = Integer.MAX_VALUE;
        int s = 1;

        int res = 0;
        while(s<=e){
            int m = s+(e-s)/2;
            long temp = (long)m*m;
            if(temp==x)return m;
            else if (temp<x) {
                res=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return res;
    }
}
