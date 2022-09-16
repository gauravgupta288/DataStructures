package gg.Month02_Sep.Day043_150922;

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        System.out.println(findSmallestLetter(new char[]{'c', 'f', 'j'}, 'd'));
    }

    static char findSmallestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

             if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }

}
