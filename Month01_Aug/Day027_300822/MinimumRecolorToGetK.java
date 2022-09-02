package gg.Month01_Aug.Day027_300822;

public class MinimumRecolorToGetK {
    public static void main(String[] args) {
        System.out.println(minColor("WBWBBBW", 2));
    }

    static int minColor(String blocks, int k) {

        int min = Integer.MAX_VALUE;
        char ch[] = blocks.toCharArray();

        for (int i = 0; i <= blocks.length()-k; i++) {
            int curCount = 0;
            for (int j = i; j < i+k; j++) {
                if (ch[j] == 'W') {
                    curCount++;
                }
            }
            min = Math.min(curCount, min);
        }
        return min;
    }
}
