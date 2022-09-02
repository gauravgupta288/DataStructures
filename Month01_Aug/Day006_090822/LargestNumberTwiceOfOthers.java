package gg.Month01_Aug.Day006_090822;

public class LargestNumberTwiceOfOthers {
    public static void main(String[] args) {
        System.out.println(largest(new int[]{1,0,9,4}));
    }

    static int largest(int a[]) {
        int f = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        int count = 0;
        for (int j = 0;j<a.length;j++) {
            int i = a[j];
            if (f <= i) {
                s = f;
                f = i;
                count=j;
            } else if (s <= i ) {
                s = i;
            }

        }
        return f < s * 2 ? -1 : count;
    }
}
