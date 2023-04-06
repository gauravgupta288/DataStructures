package Month09_April.Day149_020423.Day151_040423;

public class CheckPalindromeRecursion {
    public static void main(String[] args) {
        System.out.println(palin("naman", 0, 4));
    }

    static int palin(String A, int start, int end){
        if(start > end){
            return 1;
        }else if(A.charAt(start) != A.charAt(end)){
            return 0;
        }else{
            return palin(A, start+1, end-1);
        }
    }
}
