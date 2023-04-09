package Month09_April.Day154_090423;

public class isMagic {
    public static void main(String[] args) {
        System.out.println(magic(83557, 0));
    }

    public static int magic(int A, int sum ){
        if(A == 0){
            return 0;
        }

        sum += magic(A/10, sum) + (A % 10);
        if(sum > 9){
            magic(sum, 0);
        }

        return sum == 1 ? 1 : 0;
    }
}
