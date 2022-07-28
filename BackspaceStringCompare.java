package gg;

public class BackspaceStringCompare {
    public static void main(String[] args) {
        System.out.println(backspaceStrCompare("a##b", "c#d#"));
    }

    static boolean backspaceStrCompare(String s, String t) {
        return getFormattedString(s).equals(getFormattedString(t));
    }

    static String getFormattedString(String str) {
        StringBuilder sb = new StringBuilder();
        int s=0;
        int end=str.length();
        int k=0;
        while (s<end) {
            if (str.charAt(s) != '#') {
                sb = sb.append(str.charAt(s) );
                k++;
            }else if(s!=0&& k!=0){
                sb = sb.delete(k-1,k);
                k--;
            }
            s++;
        }
        return sb.toString();
    }
}
