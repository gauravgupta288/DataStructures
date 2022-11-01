package Month04_Nov.Day063_011122;

public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {

    }

    static boolean sortedAndRotated(int nums[]) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }

        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }

        return count <= 1;

    }

}
