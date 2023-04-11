package Month09_April;

public class Day152_100423 {
    public static void main(String[] args) {
        System.out.println(magic(83557));
    }

    public static int magic(int A){

        if(A == 0){
            return 0;
        }
        if(A < 10){
            return A == 1 ? 1 : 0;
        }

        int sum = 0;
        while(A > 0){
            sum += A % 10;
            A /= 10;
        }
        return magic(sum);
    }
}
