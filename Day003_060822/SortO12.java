package gg.Day003_060822;

public class SortO12 {
    public static void main(String[] args) {
System.out.println(sort(new int[]{0,0,1,0,1,1}));
    }

    static int sort(int[] nums) {

        int s = 0;
        int i = 0;
        int j = nums.length-1;

        while (i<j){

            if( nums[s]==0)s++;
            if(nums[j]==2)j--;

            if(nums[i]==2){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;

            } else if(nums[i]==0){
                int temp = nums[s];
                nums[s] = nums[i];
                nums[i] = temp;
                s++;

            }
            if(i>=j){
                break;
            }
            if (nums[j] == 0) {
                int temp = nums[s];
                nums[s] = nums[j];
                nums[j] = temp;
                s++;
            }
            i++;
        }

        return 0;
    }
}
