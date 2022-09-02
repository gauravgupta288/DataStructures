package gg.Month00_July.Archived;

public class ArranginCoinsLeetCode441 {
    public static void main(String s[]){
        System.out.println(arrangeCoinsSol1(1234567890));
        System.out.println(arrangeCoinsSol2(1234567890));
    }
    static int arrangeCoinsSol1(int n){

        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                sum++;
                if(n==sum)return i;
            }
        }
        return -1;
    }
    static int arrangeCoinsSol2(int n){
        int start=1,end=n;

        while(start<=end){
            long m = start+(end-start)/2;

            long num = (m*(m+1))/2;
            if(n<num){
                end=(int)m-1;
            } else if (n>num) {
                start=(int)m+1;
            }else {
                return (int)m;
            }
        }
        return start-1;
    }
}
