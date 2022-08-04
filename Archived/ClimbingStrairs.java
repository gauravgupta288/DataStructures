package gg.Archived;

public class ClimbingStrairs {
    public static void main(String s[]) {
        System.out.println(climb(1));
    }

    static int climb(int n) {
        int i = 1;
        int j = 1;
        int sum = 1;

        int totalCount = 0;
        while (sum < n) {
            totalCount = i + j;
            i = j;
            j = totalCount;
            sum++;
        }
        return totalCount;
    }
}
