package Month08_March.Day144_260323;

import java.util.ArrayList;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("10001100010111000101100010100110001001101010000010011010", "101111000100100100111110010010101110101001100100101001111010011000000110"));
    }

    static String addBinary(String A, String B) {
        char ch1[] = A.toCharArray();
        char ch2[] = B.toCharArray();
        int temp = 1;
        long sum1 = 0;
        long sum2 = 0;

        for(int i = ch1.length - 1; i >= 0; i--){
            if(ch1[i] == '1'){
                sum1 += temp;
            }
            temp *= 2;
        }

        temp = 1;
        for(int i = ch2.length - 1; i >= 0; i--){
            if(ch2[i] == '1'){
                sum2 += temp;
            }
            temp *= 2;
        }

        long res = sum1 + sum2;
        ArrayList<Character> c = new ArrayList<>();

        // Convert result to binary
        while(res > 0){

            long t = res % 2;
            if(t == 1){
                c.add('1');
            }else{
                c.add('0');
            }

            res = res >> 1;
        }

        char ch3[] = new char[c.size()];

        int k = 0;
        for(int i = c.size() - 1; i >=0; i--){
            ch3[k++ ] = c.get(i);
        }

        return String.valueOf(ch3);
    }
}
