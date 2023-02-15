package Month07_Feb.Day110_150223;

public class FactorCount {
    public static void main(String[] args) {
        System.out.println(solve(49));
    }

    public static int solve(int A){
        int count = 0;

        int sq = sqrt(A);
        for(int i = 1; i <= sq; i++){
            if(A % i == 0){
                if(i * i == A){
                    count += 1;
                }else{
                    count += 2;
                }
            }
        }
        return count;
    }
    public static int sqrt(long A) {
        int ans = 1;
        int i = 1;

        while (i * i <= A) {
            ans = i;
            i++;
        }
        return ans;
    }
}
