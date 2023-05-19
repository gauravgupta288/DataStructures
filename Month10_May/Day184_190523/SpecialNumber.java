package Month10_May.Day184_190523;

public class SpecialNumber {
    public static void main(String[] args) {
        System.out.println(solve(4628386, 78, 6));
    }

    public static int solve(int A, int B, int C) {

        int count = 0;

        int max = Math.max(B, C);
        int min = Math.min(B, C);
        int fac = 0;
        for(int i = max; i<=A; i += max ){
            if(i % min == 0){
                fac = i;
                break;
            }
        }

        if(fac == 0){
            return 0;
        }


        for(int i = fac; i <= A; i+=fac){
            if(i % B == 0 && i % C == 0){
                count++;
            }
        }

        return count;
    }
}
