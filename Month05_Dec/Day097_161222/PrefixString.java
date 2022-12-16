package Month05_Dec.Day097_161222;

public class PrefixString {
    public static void main(String[] args) {

    }

    static boolean prefixString(String s, String[] words){
        StringBuilder sb = new StringBuilder();


        for(String str : words){
            sb.append(str);

            if(sb.toString().equals(s)){
                return true;
            }
        }

        return false;
    }
}
