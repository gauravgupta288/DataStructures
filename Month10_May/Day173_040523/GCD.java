package Month10_May.Day173_040523;

public class GCD {
    public static void main(String[] args) {
        System.out.println(solve(9175058, 3772101));

        System.out.println(106978 % 4380528);
        System.out.println(4487506 % 4380528);
        System.out.println(9926418 - 2945616);
    }

    static int solve(int A, int B) {
        int min = Math.max(A, B);


        for(int i = min; i > 0; i--){
            if(A % i == B % i){
                return i;
            }
        }

        return 1;
    }

}
