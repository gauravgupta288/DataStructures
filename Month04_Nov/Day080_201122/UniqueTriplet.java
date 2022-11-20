package Month04_Nov.Day080_201122;

public class UniqueTriplet {
    public static void main(String[] args) {
        System.out.println(triplet(new int[]{4,4,2,4,3}));
    }

    static int triplet(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if((nums[i] != nums[j]) && (nums[i] != nums[k]) && (nums[j] != nums[k])){
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
