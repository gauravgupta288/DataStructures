import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(longestSubStringSol2("abcabcac"));
    }

    static int longestSubStringSol1(String str) {
        int maxLen = 1;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (sb.indexOf("" + ch) == -1) {
                    sb.append(ch);
                    if (str.equals(sb.toString())) return sb.length();
                } else {
                    if (maxLen < sb.length()) {
                        maxLen = sb.length();
                    }
                    break;
                }
            }
        }
        return maxLen;
    }

    static int longestSubStringSol2(String s) {

        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return max;
    }
}
