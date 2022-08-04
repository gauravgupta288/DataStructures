package gg.Archived;

public class SearchInsertPossition {
    public static void  main(String s[]){
        System.out.println(searchPosition(new int[]{1, 3, 5, 6}, 5));

    }
    static int searchPosition(int []nums, int target){

        int start = 0;
        int end=nums.length;

        if(target>nums[nums.length-1]) return nums.length;
        if(target<nums[0]) return 0;
        while (start<=end){

            int m = start+(end-start)/2;

            if(target>nums[m]){
                start = m+1;
            }
            else if(target==nums[m]) {
                return m;
            }
            else {
                end=m-1;
            }
        }
        return end+1;
    }
}
