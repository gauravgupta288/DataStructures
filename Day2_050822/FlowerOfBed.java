package gg.Day2_050822;

public class FlowerOfBed {
    public static void main(String[] args) {
        System.out.println(flowerOfBed(new int[]{ 0,0,0,0,1}, 2));
    }

    static boolean flowerOfBed(int[] f, int n) {
        if (f.length <= 2) {
            if (n == 0) return true;
            else return false;
        }
        for (int i = 1; i < f.length; i++) {
            if((i==1||i== f.length-1) && f[i] == 0 && f[i - 1] == 0){
                n--;
            }
            else if (f[i] == 0 && f[i - 1] == 0 && f[i + 1] == 0) {
                n--;
                i += 1;
            }
            if (n == 0) return true;
        }
        return n == 0;
    }
}
