package Month04_Nov.Day070_091122;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,2,2,3,5,4}));
    }

    static int findDuplicate(int[] nums){
        int arr[] = new int[nums.length + 1];

        for(int i = 0;i<nums.length;i++){
            arr[nums[i]]++;
        }

        for(int i = 1;i<arr.length;i++){
            if(arr[i] > 1){
                return i;
            }
        }

        return -1;
    }
}
