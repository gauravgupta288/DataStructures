package gg.Month02_Sep.Day034_060922;

public class CheckDistancesBetweenSameLetters {
    public static void main(String[] args) {
        System.out.println(checkDistance("abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }

    static boolean checkDistance(String s, int[] distance) {

        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {

            if (ch[i] == 0) {
                continue;
            } else {
                int dis = s.substring(i+1).indexOf(ch[i]);
                int temp = distance[ch[i] - 97];
                if (temp != dis) {
                    return false;
                }
                ch[i+dis+1] = 0;
            }
        }
        return true;
    }
}
