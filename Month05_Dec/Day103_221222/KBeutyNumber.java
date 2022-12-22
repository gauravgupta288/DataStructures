package Month05_Dec.Day103_221222;

public class KBeutyNumber {
    public static void main(String[] args) {
        System.out.println(kbeauty(430043, 2));
    }

    static int kbeauty(int num, int k) {
        int count = 0;
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {

            if (k + i > numStr.length()) {
                return count;
            }
            String s = numStr.substring(i, k + i);
            int z = Integer.parseInt(s);
            if (z == 0) {
                continue;
            }
            if (num % z == 0) {
                count++;
            }
        }

        return count;
    }
}
