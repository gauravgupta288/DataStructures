package Month07_Feb.Day116_260223;

public class CheckAGCountInAnArray {
    public static void main(String[] args) {
        System.out.println(solve("GAB"));;
    }

    public static int solve(String A){
        int ans = 0;
        int avalue = 0;

        for(char ch : A.toCharArray()){
            if(ch == 'A'){
                avalue++;
            }else if(ch == 'G'){
                ans += avalue;
            }
        }

        return ans;
    }
}
