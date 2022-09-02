package gg.Month00_July.Archived;

public class UglyNumberLeetCode263 {
    public static void main(String s[]){
System.out.println(NthUglyNumber(1690));
    }
    static boolean uglyNumber(int n){

        for(int i=2;i<6&&n>0;i++){
            while(n%i==0){
                n /=i;
            }
        }
        return n==1;
    }

    static int NthUglyNumber(int n){
        int count=0;
        int i=1;

        for(i=1;i<=Integer.MAX_VALUE;i++){
            if(uglyNumber(i)) count++;

            if(count==n)break;
        }
        return i;
    }
}
