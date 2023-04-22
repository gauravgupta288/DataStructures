package Month09_April.Day164_220423;

public class Bitwise {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,1,3}, new int[]{10,2,5,0}));
    }

    static int solve(int num1[], int num2[]){
        int ans = 0;

        if(num1.length % 2 == 0 && num2.length % 2 == 0){
            return 0;
        }

        if(num1.length % 2 == 0) {
            return xor(num1);
        }

        if(num2.length % 2 == 0) {
            return xor(num2);
        }



        return xor(num1) ^ xor(num2);
    }

    static public int xor(int num1[]){
        int result = 0;

        for(int i : num1){
            result ^= i;
        }

        return result;
    }
}
