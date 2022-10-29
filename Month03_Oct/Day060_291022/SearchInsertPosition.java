package gg.Month03_Oct.Day060_291022;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsertPosition(new int[]{1,3,5,6}, 7));
    }

    static int searchInsertPosition(int nums[], int target){

        int start = 0;
        int end = nums.length;;

        while(start < end){
            int mid = start + (end - start)/2;

            if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        return start;
    }
}
