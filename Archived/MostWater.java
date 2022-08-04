package gg.Archived;

public class MostWater {

    public static void main(String s[]) {
        System.out.println(mostWaterContainerSol3(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    static int mostWaterContainerSol1(int nums[]) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int num = (Math.min(nums[i], nums[j]) * (j - i));
                max = Math.max(max, num);
            }
        }
        return max;
    }

    static int mostWaterContainerSol2(int nums[]) {
        int max = 0;

        int i = 0, j = nums.length - 1;

        while (i < j) {
            max = Math.max(max, Math.min(nums[i], nums[j]) * (j - i));
            if (nums[i] < nums[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

    /**
     * Difficulty level hard, width of pillar is 1 mtr long,
     * minus in between pillar from the array.
     *
     * @param nums
     * @return
     */
    static int mostWaterContainerSol3(int nums[]) {
        int max = 0;
        int i = 0, j = 1;
        int sum = 0;

        while (j < nums.length) {
            if (i == 0 && nums[i] == 0) {
                i++;
            } else if (nums[i] <= nums[j]) {
                max += ((j - i - 1) * (Math.min(nums[i], nums[j]))-sum);
                i = j;
                sum=0;
            }else {
                sum += nums[j];
            }
            j++;
        }
        return max;
    }
}
