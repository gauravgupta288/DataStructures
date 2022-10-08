package gg.Month03_Oct.Day051_081022;

public class SmallestIndexWithEqualValue {
    public static void main(String[] args) {
        System.out.println(smallestValue(new int[]{4,3,2,1}));
    }

    static int smallestValue(int[] nums){

        for(int i = 0;i< nums.length;i++){
            if(i%10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
