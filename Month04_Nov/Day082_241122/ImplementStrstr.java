package Month04_Nov.Day082_241122;

public class ImplementStrstr {
    public static void main(String[] args) {
        System.out.println(implementStrstr("geeksforgeeks", "for"));
    }

    static int implementStrstr(String s, String x) {

        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            int j = i;


            if (s.charAt(j) == x.charAt(len)) {
                while (j < s.length() && len < x.length() && s.charAt(j) == x.charAt(len)) {
                    len++;
                    j++;
                }
                if(len == x.length()){
                    return i;
                }else{
                    len = 0;
                }
            }
        }

        return -1;
    }
}
