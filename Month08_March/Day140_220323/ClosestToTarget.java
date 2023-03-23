package Month08_March.Day140_220323;

public class ClosestToTarget {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{0,0,0}, 1));
    }

    static int solve(int nums[], int target){
        int ans = Integer.MAX_VALUE;
        int finalAns =  Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int temp = nums[i] + nums[j] + nums[k];

                    if( Math.abs(temp - target) < finalAns){
                        finalAns = Math.abs(temp - target);
                    }
                }
            }
        }

        return finalAns > target ? finalAns + target : target + finalAns;
    }
}
