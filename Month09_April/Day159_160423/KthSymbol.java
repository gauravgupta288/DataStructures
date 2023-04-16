package Month09_April.Day159_160423;

public class KthSymbol {
    public static void main(String[] args) {
        System.out.println(solve(3, 0));
    }

    static int solve(int A, int B){
        String str = print(A, "10");
        char ch = (str.charAt(B));
        return ch == 49 ? 1 : 0;
    }

    static String print(int A, String str){
        if(A == 1){
            return str;
        }

        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch == '0'){
                sb.append("01");
            }else{
                sb.append("10");
            }
        }

        return print(A - 1, sb.toString());
    }
}
