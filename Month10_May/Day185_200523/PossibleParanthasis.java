package Month10_May.Day185_200523;

import java.util.ArrayList;
import java.util.List;

public class PossibleParanthasis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static String[] generateParenthesis(int A) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        validParen(0 , 0, "" , list, A);

        String[] str = new String[list.size()];

        for(int i = 0; i < str.length; i++){
            str[i] = list.get(i);
        }
        return str;
    }

    static void validParen(int rOpen , int rClose, String sb, List<String> ans, int A  ){
        if(sb.length() == 2 * A){
            System.out.println(sb);
            ans.add(sb);
            return;
        }

        if(rClose < rOpen){
            validParen( rOpen,  rClose+1,  sb + (')'),  ans, A );
        }
        if(rOpen < A){
            validParen( rOpen + 1,  rClose,  sb + '(',  ans, A );
        }

        return;
    }
}
