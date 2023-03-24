package Month08_March.Day142_240323;

public class Contest {
    public static void main(String[] args) {
        System.out.println(solve(21, 1, 3));
    }

    static int solve(int A, int B, int C){
        int x = A;
        for(int i = 0; i < C; i++){
            int temp = (x & (1 << i));
            if(temp != 0 ){
                x = x ^ (1 << i);
            }
        }
        for(int i = 0 ; i < B; i++){

            int temp = (A & (1 << i));
            if(temp != 0 ){
                x = x ^ (1 << i);
            }
        }

        return x;
    }
}
