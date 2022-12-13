package Month05_Dec.Day095_131222;

public class SummationOfwords {
    public static void main(String[] args) {
        System.out.println(isSame("aaa", "a", "aab"));
    }

    static boolean isSame(String firstWord, String secondWord, String targetWord){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        int res = 0;
        int z = 0;
        for(char ch : firstWord.toCharArray() ){
            sb1.append(ch - 'a');
        }

        for(char ch : secondWord.toCharArray() ){
            sb2.append(ch - 'a');
        }

        res = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());

        for(char ch : targetWord.toCharArray() ){
            sb3.append(ch - 'a');
        }
        z = Integer.parseInt(sb3.toString());
        return res == z;
    }
}
