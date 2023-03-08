package Month08_March.Day126_080323;

public class LongestVowels {
    public static void main(String[] args) {
        System.out.println(solve("interviewbit"));
    }

    static String solve(String A){
        StringBuilder sb = new StringBuilder();
        String s = "aeiouAEIOU";

        for(char ch : A.toCharArray()){
            if(s.indexOf(ch) != -1){
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
