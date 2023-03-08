package Month08_March.Day126_080323;

public class NextPalindrome {
    public static void main(String[] args) {
        System.out.println(solve("23545"));
    }

    static String solve(String A){

        int num = Integer.parseInt(A);
        for(int i = num + 1; i < num * 10; i++){
            int k = i;
            int sum = 0;
            while(k > 0){
                sum = (sum * 10) + (k % 10);
                k /= 10;
            }
            if(i == sum){
                return Integer.toString(i);
            }
        }
        return "";
    }
}
