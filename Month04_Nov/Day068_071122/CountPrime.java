package Month04_Nov.Day068_071122;

public class CountPrime {
    public static void main(String[] args) {
        System.out.println(countPrime(20));
    }

    static int countPrime(int n) {
        int arr[] = new int[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if(arr[i] == 0){
                count++;
                for (int j = i * 2; j < n; j = j + i) {
                    arr[j] = 1;
                }
            }
        }

        return count;
    }
}
