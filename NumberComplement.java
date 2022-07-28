package gg;

public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(reverseComp(5));
    }

    static int reverseComp(int num) {

        String binary = Integer.toBinaryString(num);
        int num1=0;
        int k=0;
        for(int i=binary.length()-1;i>=0;i--){
            if(binary.charAt(i)=='0'){
                num1+=Math.pow(2,k);
            }
            k++;
        }
        return num1;
    }

}
