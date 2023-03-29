package Month08_March.Day144_260323;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
    }

    static String addBinary(String A, String B) {
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int i = A.length() - 1;
        int j = B.length() - 1;
        for(; i >= 0 && j >= 0; i--,j--){
            char ch = A.charAt(i);
            char ch1 = B.charAt(j);
            if((ch == '0') && (ch1 == '0')){
                if(carry == 0){
                    sb.append('0');
                    carry = 0;
                }else{
                    sb.append('1');
                    carry = 0;
                }
            }else if((ch == '0') && (ch1 == '1') || (ch == '1') && (ch1 == '0')){
                if(carry == 0){
                    sb.append('1');
                    carry = 0;
                }else{
                    sb.append('0');
                    carry = 1;
                }
            }else if((ch == '1') && (ch1 == '1')){
                if(carry == 0){
                    sb.append('0');
                    carry = 1;
                }else{
                    sb.append('1');
                    carry = 1;
                }
            }
        }
        while(i >=  0){
            char ch = A.charAt(i);
            if(ch == '0'){
                if(carry == 1){
                    sb.append('1');
                    carry = 0;
                }else{
                    sb.append('0');
                    carry = 0;
                }
            }else{
                if(carry == 1){
                    sb.append('0');
                    carry = 1;
                }else{
                    sb.append('1');
                    carry = 0;
                }
            }
            i--;
        }

        while(j >= 0){
            char ch = B.charAt(j);
            if(ch == '0'){
                if(carry == 1){
                    sb.append('1');
                    carry = 0;
                }else{
                    sb.append('0');
                    carry = 0;
                }
            }else{
                if(carry == 1){
                    sb.append('0');
                    carry = 1;
                }else{
                    sb.append('1');
                    carry = 0;
                }
            }
            j--;
        }
        if(carry == 1){
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}

