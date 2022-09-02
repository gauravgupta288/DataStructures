package gg.Month01_Aug.Day004_070822;

public class LemonadeChange {
    public static void main(String[] args) {
        System.out.println(lemonade(new int[]{5,5,5,10,20}));
    }

    static boolean lemonade(int arr[]) {
        int five = 0;
        int ten = 0;

        for (int i : arr) {
            if (i == 5) five++;
            else if (i == 10) {
                five--;
                ten++;
            } else if (i == 20) {
                if (five > 0 && ten > 0){
                    five--;
                    ten--;
                } else if (five>2) {
                    five-=3;
                }else{
                    return false;
                }
            }
        }if(five<0)return false;
        return true;
    }
}
