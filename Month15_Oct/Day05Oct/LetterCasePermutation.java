package Month15_Oct.Day05Oct;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }

    public static List<String> letterCasePermutation(String s) {


        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            StringBuilder temp = new StringBuilder(s);
            char ch = s.charAt(i);

            if((ch >= 'a' && ch <= 'z')){
                ans.add(temp.toString());
                temp.setCharAt(i, Character.toUpperCase(ch));
                ans.add(temp.toString());
            }else if(ch >= 'A' && ch <= 'Z'){
                ans.add(temp.toString());
                temp.setCharAt(i, Character.toLowerCase(ch));
                ans.add(temp.toString());
            }
        }

        return ans;
    }
}

class A extends LetterCasePermutation{

}

class B{
    public static void main(String[] args) {
        LetterCasePermutation obj = new A();
    }
}
