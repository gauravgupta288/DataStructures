package Month09_April.Day150_030423;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        System.out.println(isValidSudoku(new String[]{"53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79" }));
    }

    static int isValidSudoku(final String[] A) {

        //Validate rows
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
            for (int j = 0; j < 9; j++) {
                if(j % 3 == 0 && j > 0){
                    set.clear();
                }
                for (int k = 0 + i; k < 3 + i; k++) {
                    if (set.contains(A[j].charAt(k))) {
                        return 0;
                    }
                    if (Character.isDigit(A[j].charAt(k))) {
                        set.add(A[j].charAt(k));
                    }
                }

            }
        }

        //Validate Columns
        for (int i = 0; i < A.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < A[i].length(); j++) {
                if (set.contains(A[j].charAt(i))) {
                    return 0;
                }
                if (Character.isDigit(A[j].charAt(i))) {
                    set.add(A[j].charAt(i));
                }
            }
        }

        return 1;
    }
}
