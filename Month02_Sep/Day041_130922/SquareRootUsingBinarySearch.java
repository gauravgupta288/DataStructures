package gg.Month02_Sep.Day041_130922;

public class SquareRootUsingBinarySearch {

    public static void main(String[] args) {

    }
    public int mySqrt(int x) {

        if(x==0)return 0;

        int e = x;
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
