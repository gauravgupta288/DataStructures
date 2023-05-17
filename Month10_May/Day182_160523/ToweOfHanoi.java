package Month10_May.Day182_160523;

import java.util.ArrayList;
import java.util.List;

public class ToweOfHanoi {
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3));
    }

    static int[][] towerOfHanoi(int A) {
        List<int[]> list = new ArrayList<>();
        tower(A, 1, 3, 2, list);

        int fans[][] = new int[list.size()][3];

        for (int i = 0; i < list.size(); i++) {
            fans[i] = list.get(i);
        }
        return fans;
    }

    static void tower(int disk, int start, int end, int temp, List<int[]> ans) {
        if (disk == 1) {
            ans.add(new int[]{disk, start, end});
            return;
        }

        tower(disk - 1, start,temp, end,  ans);
        ans.add(new int[]{disk, start, end});
        tower(disk - 1, temp, end, start, ans);

    }
}
