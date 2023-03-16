package Month08_March.Day134_160323;

public class UnsetXbits {
    public static void main(String[] args) {
        System.out.println(solve(53, 5));
    }

    static long solve(long A, long B){
        long ans = 0;

        for(int i = 0; i < B; i++){
            long temp = A & (1 << i);
            if( temp == 1 << i){
                A = A ^ (1 << i);
            }
        }
        return A;
    }
}
