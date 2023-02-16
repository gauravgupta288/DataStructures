package Month07_Feb.Day111_160223;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(prime(19));
    }
    public static int prime(int A){
        int count = 0;

        for(int i = 2;i <= A;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n){

        for(int i = 2; i * i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
