package gg.Archived;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        System.out.println(maxConsecutive(new int[]{1, 1, 1,0, 1, 0,1,1}));
    }

    static int maxConsecutive(int arr[]) {

        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count=0;
            }
        }
        return count > max ? count : max;
    }
}
