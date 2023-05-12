package Month10_May.Day177_100523;

public class NumberOfOpenDoors {
    public static void main(String[] args) {
        System.out.println(solve(62360));
    }

    static int solve(int A){
        int ans = 0;
        for(int i = 1;i <= A; i++){
            int num = factors(i) & 1;
            if(num == 1){
                ans++;
            }
        }
        return ans;
    }

    static int factors(int A){
        int count = 0;
        for(int i = 1; i * i <= A; i++ ){
            if(A % i == 0){
                if(i != A/i){
                    count++;
                }
                count++;
            }
        }

        return count;
    }
}
