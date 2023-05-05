package Month10_May.Day174_050523;

public class SageAndBinary {
    public static void main(String[] args) {
        System.out.println(solve(16));
    }

    static int solve(int A){
        StringBuilder sb = new StringBuilder();

        int cnt= 0;
        while(A > 0){
            int temp = A & 1;

            if(temp == 1){
                cnt++;
            }
            sb.append(temp);

            A >>= 1;
        }
        if(cnt <= 1){
            return 0;
        }


        int max = 0;

        for(int i = 0; i < sb.length();i++){
            char ch = sb.toString().charAt(i);

            if(ch == '1'){
                int k = i+1;
                while( k < sb.length() && sb.toString().charAt(k) == '0'){
                    k++;
                }
                max = Math.max(max, k - i);
            }
        }
        return max;
    }
}
