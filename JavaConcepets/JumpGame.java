package JavaConcepets;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,2,2,0,1,1}));
    }

    public static boolean  solve(int nums[]){




        if(nums.length == 1){
            return true;
        }else{
            if(nums[0] == 0){
                return false;
            }
        }
        int i = 0;
        while(i < nums.length){
            int count = 0;
            i = i + nums[i];

            if(i >= nums.length) return true;

            if(nums[i] == 0){
                count++;
                i--;
            }

            if(i == 0){
                return false;
            }
            while (i > 0) //
            {
                if(nums[i] <= count){
                    count++;
                    i--;
                }
                if(i == 0){
                    return false;
                }
                if(i != 0 && nums[i] > count){
                    break;
                }
            }
        }

        if(i == 0){
            return false;
        }
        return  true;
    }
}
