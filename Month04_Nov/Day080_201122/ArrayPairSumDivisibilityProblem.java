package Month04_Nov.Day080_201122;

public class ArrayPairSumDivisibilityProblem {
    public static void main(String[] args) {
        System.out.println(arraySum(new int[]{14, 10, 1, 1}, 3));
    }

    static boolean arraySum(int[] nums, int k) {

        if(nums.length % 2 != 0){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                    nums[i] = -1;
                    nums[j] = -1;
                    break;
                }
            }
        }

        for(int i:nums){
            if (i != -1){
                return false;
            }
        }
        return true;
    }
}
