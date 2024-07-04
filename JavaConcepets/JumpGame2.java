package JavaConcepets;

public class JumpGame2 {
    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }

    static public int jump(int[] nums) {

        int cnt = 1;
        int i = 0;
        int max = nums[0];

        while(i < nums.length){
            for(int j = i; j < nums[i]; j++){
                if(max < nums[j]){
                    max = nums[j];
                    cnt++;
                    i = i + j;
                }

                if(j == nums.length - 1) return cnt;

            }
        }

        return cnt;
    }
}
