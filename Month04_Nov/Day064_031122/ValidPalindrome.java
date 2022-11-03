package Month04_Nov.Day064_031122;

public class ValidPalindrome {
    public boolean isPalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;

        char ch[] = str.toCharArray();
        while(s < e){
            boolean ch1 = isValidChar(ch[s]);
            boolean ch2 = isValidChar(ch[e]);
            if(!ch1){
                s++;
            }
            if(!ch2){
                e--;
            }
            if(ch1 && ch2){
                char s1 = convertToSmall(ch[s++]);
                char s2 = convertToSmall(ch[e--]);

                if(s1 != s2){
                    return false;
                }
            }

        }

        return true;
    }

    private char convertToSmall(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return (char)(ch - 'A' + 'a');
        }else{
            return ch;
        }
    }

    private boolean isValidChar(char ch){
        return ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch >= '0' && ch <= '9') ? true : false;
    }
}
