package gg.Day4_070822;

public class ReverseAnArrayUsingRecursion {

    public static void main(String[] args) {
        char arr[] = new char[]{1, 2, 3, 4, 5};
        reverse(0, arr.length - 1, arr);
    }

    static void reverse(int i, int j, char arr[]){
        if (i >= j) return;

        swap(i, j, arr);
        reverse(i + 1, j-1, arr);

    }

    static void swap(int l, int r, char s[]) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
}
