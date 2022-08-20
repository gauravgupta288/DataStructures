package gg.Day016_190822;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.print(jewelsAndStones("zZ", "ZZ"));
    }

    static int jewelsAndStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
