package Month05_Dec.Day096_151222;

public class DevideAGroup {
    public static void main(String[] args) {
        System.out.println(divideString("ctoyjrwtngqwt", 8, 'n'));

    }

    static String[] divideString(String s, int k, char fill) {
        int q = s.length() / k;
        int r = s.length() % k;
        StringBuilder sb = new StringBuilder();
        String[] str;
        if(r != 0){
             str = new String[q + 1];
        }else{
             str = new String[q];
        }
        int m = 0;
        int z = 0;
        for(int i = 0; i < s.length();i++){

            if(z == k){
                z = 0;
                str[m++] = sb.toString();;
                sb.setLength(0);
            }
            z++;
            sb.append(s.charAt(i));
        }

        if( sb.length()== k){
            str[str.length - 1] = sb.toString();
            return str;
        }
        while(r < k){
            sb.append(fill);
            r++;
        }
        str[str.length - 1] = sb.toString();
        return str;
    }
}
