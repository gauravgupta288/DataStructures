package Month08_March.Day146_280323;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(solve("abccccdd"));
    }

    static String solve(String A){
        String ans = new String();
        for(int i = 0; i < A.length(); i++){
            String temp = palin(i,i,A);
            if(ans.length() < temp.length()){
                ans = temp;
            }
        }

        for(int i = 1; i < A.length(); i++){
            String temp = palin(i-1,i,A);
            if(ans.length() < temp.length()){
                ans = temp;
            }
        }
        return ans;
    }

    static String palin(int p1, int p2, String s){
        int start = -1;
        int end = -1;
        while(p1 >=0 && p2 <= s.length() - 1 && s.charAt(p1) == s.charAt(p2)){
            start = p1;
            end = p2;
            p1--;
            p2++;
        }
        return start == -1 ? s.substring(0, 1) : s.substring(start, end+1);
    }

}
