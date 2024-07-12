package Backtracking;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "dvdf";
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            String t = String.valueOf(s.charAt(i));
            if(sb.indexOf(t) == -1){
                sb.append(t);
                ans = Math.max(ans, sb.length());
            }else{
                ans = Math.max(ans, sb.length());
                sb = new StringBuilder();
                sb.append(t);
            }
        }

        System.out.println(ans);
    }
}
