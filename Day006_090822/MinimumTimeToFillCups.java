package gg.Day006_090822;

public class MinimumTimeToFillCups {
    public static void main(String[] args) {
        System.out.println(minimumTime(new int[]{5,4,4}));
    }

    static int minimumTime(int a[]) {
        if (a.length != 3) return 0;
        int count = 0;
        int i = 1;
        while ((a[0] != 0 && a[1] != 0) || (a[0] != 0 && a[2] != 0) || (a[2] != 0 && a[1] != 0)) {
            int max1;
            int max2;


            if (a[0] > a[1]) {
                max1 = 0;
                if (a[1] > a[2]) {
                    max2 = 1;
                } else {
                    max2 = 2;
                }
            }else{
                max1 = 1;
                if(a[0]>a[2]){
                    max2 = 0;
                }else{
                    max2 = 2;
                }
            }
            a[max1] -= 1;
            a[max2] -= 1;
            count++;
        }
        return count + a[0] + a[1] + a[2];
    }
}
