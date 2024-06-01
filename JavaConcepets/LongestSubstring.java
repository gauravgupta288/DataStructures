package JavaConcepets;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 1;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            String ch = (Character.toString(s.charAt(i)));

            while(sb.indexOf(ch) == -1){
                sb.append(ch);
            }
            ans = Math.max(ans, sb.length());

            String str =  sb.substring(sb.lastIndexOf(ch));
            sb.delete(0, sb.length());

            sb.append(str);
        }

        return ans;
    }
}
