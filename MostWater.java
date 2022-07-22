package gg;

public class MostWater {

    public  static void main(String s[]){
System.out.println(mostWaterContainer(new int[]{1,8,6,2,5,4,8,3,7,10}));
    }

    static int mostWaterContainer(int nums[]){
        int max = 0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                int num = (Math.min(nums[i], nums[j]) * (j-i));
                max = Math.max(max, num);
            }
        }
        return max;
    }
}
