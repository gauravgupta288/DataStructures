package Month04_Nov.Day064_031122;

public class RemoveAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        System.out.println(removeSubString("daabcbaabcbc", "abc"));
    }

    static String removeSubString(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.indexOf(part) != -1) {
            sb.replace(sb.indexOf(part), sb.indexOf(part) + part.length(), "");
        }


        return sb.toString();
    }
}
