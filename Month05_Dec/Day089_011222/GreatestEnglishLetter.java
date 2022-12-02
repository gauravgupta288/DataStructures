package Month05_Dec.Day089_011222;

public class GreatestEnglishLetter {
    public static void main(String[] args) {
        System.out.println(greatestLetter("leTcOdeeeee"));
    }

    static String greatestLetter(String s) {
        int chArray[] = new int[26];

        for(char ch : s.toCharArray()){

            if(Character.isUpperCase(ch)){
                int count = chArray[ch - 'A'];
                if(count == 0 || count == 1){
                    chArray[ch - 'A'] += chArray[ch - 'A'] + 2;
                }
            }else if(Character.isLowerCase(ch)){
                int count = chArray[ch - 'a'];
                if(count == 0 || count == 2){
                    chArray[ch - 'a'] += chArray[ch - 'a'] + 1;
                }
            }
        }

        for(int i = 25; i>=0;i--){
            if(chArray[i] > 2){
                return Character.toString((char)(i + 'a')).toUpperCase();
            }
        }

        return "";
    }
}
