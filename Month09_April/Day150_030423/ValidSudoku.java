package Month09_April.Day150_030423;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        System.out.println(isValidSudoku(new String[]{"..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.."}));
    }

    static int isValidSudoku(final String[] A) {

        //Validate Columns
        for (int i = 0; i < A.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < A[i].length(); j++) {
                if (set.contains(A[i].charAt(j))) {
                    return 0;
                }
                if (Character.isDigit(A[i].charAt(j))) {
                    set.add(A[i].charAt(j));
                }
            }
        }
        //Validate box of 9
        for (int i = 0; i < 9; i += 3) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < 9; j += 3) {
                for (int k = 0; k < 3; k++) {
                    if (set.contains(A[j].charAt(k))) {
                        return 0;
                    }
                    if (Character.isDigit(A[j].charAt(k))) {
                        set.add(A[j].charAt(k));
                    }
                }
            }
        }

        return 1;
    }
}
