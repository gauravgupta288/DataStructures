package gg.Day028_310822;

public class SlidingWindow {
    public static void main(String[] args) {
        System.out.println(slidingWin("BWBBWWBBWBW", 7));
    }

    static int slidingWin(String s, int k) {
        int count = 0;
        int minCount;
        char ch[] = s.toCharArray();
        int i;
        for (i = 0; i < k; i++) {
            count = ch[i] == 'W' ? count+1 : count;
        }
        minCount = count;

        for (int j = i; j < ch.length; j++) {
            count = ch[j - k] == 'W' ? count-1 : count;
            count = ch[j] == 'W' ? count+1 : count;

            minCount = Math.min(count, minCount);
        }
        return minCount;
    }
}
