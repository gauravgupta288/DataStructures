package Month13_Aug.Day220_270823;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aa"));
    }

    public static  boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                sb.append(Character.toLowerCase(ch));
            }

        }

        return solve(sb.toString(), 0, sb.length() - 1);
    }

     static boolean solve(String str, int s, int e){
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }

        if(s > e){
            return true;
        }

        return solve(str, s+1, e-1);
    }
}
