package gg.Month02_Sep.Day036_080922;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        System.out.println(singleElement(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8}));
    }

    static int singleElement(int nums[]) {
        if(nums.length==1) return nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(i==1 && (nums[i] ^ nums[i - 1]) !=0){
                return nums[i - 1];
            }else if(i== nums.length-2 && (nums[i] ^ nums[i + 1]) !=0){
                return nums[i + 1];
            }
            int k = nums[i] ^ nums[i - 1];
            int j = nums[i] ^ nums[i + 1];
            if (k != 0 && j != 0) {
                return nums[i];
            }
        }

        return -1;
    }
}
