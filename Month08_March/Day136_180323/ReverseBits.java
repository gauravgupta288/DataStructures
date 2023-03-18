package Month08_March.Day136_180323;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverse(10));
    }

    static long reverse(int A) {
        long sum = 0;
        long res = 2147483648L;

        for (int i = 31; i >= 0; i--) {
            if(A % 2 == 1){
                sum += res;
            }
            res = res >> 1;
            A = A >> 1;
        }
        return sum;
    }
}
