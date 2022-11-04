package Month04_Nov.Day065_041122;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeAdjacentString("s"));
    }

    static String removeAdjacentString(String s){
        StringBuilder sb = new StringBuilder(s);

        int i = 1;
        while(i < sb.length()){
            if(i > 0 && sb.charAt(i) == sb.charAt(i-1)){
                sb.replace(i-1, i+1, "");
                i--;
            }else{
                i++;
            }
        }
        return sb.toString();
    }
}
