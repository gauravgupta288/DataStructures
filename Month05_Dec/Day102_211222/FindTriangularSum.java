package Month05_Dec.Day102_211222;

public class FindTriangularSum {
    public static void main(String[] args) {
        System.out.println(findTraingularSum(new int[]{0,3,3,4,1,2,6,4,9,3,5,1,7,7,3,0,3,2,5,1,9,0,2,6,3,9,2,5,9,2,6,4,2,9,7,2,0,3,0,1,1,2,7,8,6,4,4,5}));
    }

    static int findTraingularSum(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                nums[j] = (nums[j]%10) + (nums[j + 1]%10);
            }
        }
        return nums[0] % 10;
    }
}
