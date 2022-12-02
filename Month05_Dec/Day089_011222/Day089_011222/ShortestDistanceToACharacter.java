package Month05_Dec.Day089_011222.Day089_011222;

import java.util.ArrayList;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        shortestDistance("loveleetcode", 'e');
    }

    static int[] shortestDistance(String s, char c) {
        ArrayList<Integer> al = new ArrayList<>();
        int ans[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                al.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int j = 0;
            int min = Integer.MAX_VALUE;

            while (j < al.size()){
                min = Math.min(Math.abs(al.get(j++) - i), min);
            }
            ans[i] = min;
        }

        return ans;
    }
}
