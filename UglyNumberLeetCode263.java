package gg;

public class UglyNumberLeetCode263 {
    public static void main(String s[]){
System.out.println(uglyNumber(15));
    }
    static boolean uglyNumber(int n){

        boolean flag = false;
        int i=2;
        while(n>=i){

            if(i==2||i==3||i==4||i==5||i==6||i==10||i==15||i==30){
                if((n)%i==0){
                    flag=true;
                }
            }else{
                if((n)%i==0){
                    flag=false;
                    break;
                }
            }
            i++;
        }
        return flag;
    }
}
