package Month10_May.Day177_100523;

public class NumberOfOpenDoors {
    public static void main(String[] args) {
        System.out.println(solve(8324616));
    }

    static int solve(int A){
        int ans[] = new int[A + 1];
        for (int i = 1; i <= A/2; i++) {
            for (int j = i; j <= A; j += i) {
                if(ans[j] == 0){
                    ans[j] = 1;
                }else{
                    ans[j] = 0;
                }
            }
        }
        int count = 0;
        for(int i = 1; i < ans.length; i++){
            if(ans[i] == 1){
                count++;
            }
        }

        return count;
    }
}
