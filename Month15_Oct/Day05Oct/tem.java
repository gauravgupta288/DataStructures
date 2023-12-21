package Month15_Oct.Day05Oct;

public class tem {
    public static void main(String[] args) {
        System.out.println(minimizedMaximum(1, new int[]{100000}));
    }

    public static  int minimizedMaximum(int n, int[] quantities) {

        int e = 0;
        int ans = 0;

        for(int i : quantities){
            e = Math.max(e, i);
        }

        int s = 1;

        while(s <= e){
            int m = s +(e - s)/2;
            if(isPossibleSol(quantities, m, n)){
                e = m - 1;
                ans = m;
            }else{
                s = m + 1;
            }
        }

        return ans;
    }

    static boolean  isPossibleSol(int []quantities, int m, int n){

        for(int i : quantities){
            if(i >= m){
                int mod = i % m;
                int k = i / m;
                n = n - k;

                if(mod > 0){
                    n--;
                }
            }else{
                n--;
            }

            if(n < 0){
                return false;
            }
        }

        return true;
    }
}
