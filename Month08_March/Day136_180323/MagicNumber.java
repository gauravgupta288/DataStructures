package Month08_March.Day136_180323;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(solve2(10));
    }

    static int solve(int A){
        int ans = 0;

        int temp = A;
        int x = 1;

        for(int i = 0; A > 0; i++){
            int pow = 1;
            if((temp & x) != 0){
                for(int j = 0; j <= i; j++){
                    pow *= 5;
                }
                ans += pow;
            }
            A = A >> 1;
            x = x << 1;
        }

        return ans;
    }

    static int solve2(int A){
        int x = 1;
        int ans = 0;

        while(A > 0){
            x *= 5;
            if(A % 2 == 1){
                ans += x;
            }
            A = A >> 1;
        }

        return ans;
    }
}
