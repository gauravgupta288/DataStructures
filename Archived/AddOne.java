package gg.Archived;

public class AddOne {
    public static void main(String str[]){

        double x = 2.00000;
                int n=-2 ;
        double res=1;
int temp=n;
        if(n<0){
            temp=-n;
        }
        for(int i=0;i<temp;i++){
            res = res * x;
        }
        if(n<0){
            System.out.printf("%.2f", 1/res);
        }else{
            System.out.printf("%.5f", res);
        }


        StringBuilder s = new StringBuilder();
        int []digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        for(int i=0;i<digits.length;i++){
            s.append(digits[i]);
        }
        long num = Long.parseLong(s.toString());
        num+=1;

        String str1 = Long.toString(num);
        for(int i = 0;i<str1.length();i++){
            digits[i] = str1.charAt(i)-'0';
        }

        for(int i:digits){
            System.out.print(i);
        }
    }
}
