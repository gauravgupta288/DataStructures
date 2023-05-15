package Month10_May.Day180_140523;

public class PairSum {
    public static void main(String[] args) {
        System.out.println((int)Math.pow(2,31)% 33);
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}, 2));
    }

    static int sum(int A[], int B) {
        int mod = 1000000007;
        int count = 0;

        int aux[] = new int[B];

        for(int i = 0; i < A.length; i++){
            aux[A[i] % B]++;
        }


        return count;
    }
}
