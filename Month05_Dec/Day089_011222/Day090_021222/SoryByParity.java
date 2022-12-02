package Month05_Dec.Day089_011222.Day090_021222;

public class SoryByParity {

    public static void main(String[] args) {
        System.out.println(sortByParity(new int[]{3, 1, 2, 4}));
    }

    static int[] sortByParity(int[] nums) {

                int i = 0;
                int s = 0;
                int e = nums.length - 1;

                while (i < nums.length) {
                    if (nums[i] % 2 == 0) {
                        int temp = nums[s];
                        nums[s] = nums[i];
                        nums[i] = temp;
                        s++;
                        e--;
                    }
                    i++;
                }

                return nums;

    }
}
