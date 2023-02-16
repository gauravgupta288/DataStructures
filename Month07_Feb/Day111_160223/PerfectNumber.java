package Month07_Feb.Day111_160223;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(perfectNumber(6));
    }

    public static int perfectNumber(int a){
        int sum = 1;

        for(int i = 2; i * i <= a; i++ ){
            if(a % i == 0){
                sum += i;
                sum += a/i;
            }
        }

        return sum == a ? 1 : 0;
    }
}
