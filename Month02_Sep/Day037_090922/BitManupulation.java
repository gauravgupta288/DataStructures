package gg.Month02_Sep.Day037_090922;

public class BitManupulation {
    public static void main(String[] args) {

    }

    static int numberofStepToBecomeZero(int num){
        int steps = 0;
        while(num!=0){
            int s = num & 1;
            if(s == 0){
                steps++;
                num = num>>1;
            }else{
                num-=1;
                steps++;
            }
        }
        return steps;
    }
}
