package Month10_May.Day191_300523;

public class Day191_300523 {
    public static void main(String[] args) {
        System.out.println(solve(2));
    }

    static int solve(int A){
        int ans = 0;
        int start = 0;
        int end = A;

        int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;
            if(mid * mid == A){
                return mid;
            }else if(mid * mid > A){
                end = mid - 1;
            }else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
