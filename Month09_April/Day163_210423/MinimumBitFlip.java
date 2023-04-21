package Month09_April.Day163_210423;

public class MinimumBitFlip {
    public static void main(String[] args) {
        System.out.println(solve(3, 4));
    }

    static int solve(int start, int goal) {

        int differenceInBits = 0;
        int index = 0;
        while (index < 32) {
            int startIndexValue = start & (1 << index);
            int goalIndexValue = goal & (1 << index);

            if (startIndexValue != goalIndexValue) {
                differenceInBits++;
            }
            index++;
        }

        return differenceInBits;
    }
}
