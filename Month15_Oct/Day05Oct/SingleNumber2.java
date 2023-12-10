package Month15_Oct.Day05Oct;

public class SingleNumber2 {
    public static void main(String[] args) {
        singleNumber(new int[]{1,2,1,3,2,5});
    }

    public static int[] singleNumber(int[] nums){


        int xor = 0;

        for(int num : nums){
            xor ^= num;
        }

        int mask = xor & (-xor);

        int ans = 0;
        int ans1 = 0;

        for(int num : nums){
            if((num & mask) == 0){
                ans ^= num;
            }else{
                ans1 ^= num;
            }
        }

        return new int[]{ans, ans1};
    }
}
