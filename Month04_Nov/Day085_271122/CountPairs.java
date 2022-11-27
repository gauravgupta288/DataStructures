package Month04_Nov.Day085_271122;

public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{3,2,1,5,4}, 2));
    }

    static int countPairs(int[] nums, int k){

        int count = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int z = Math.abs(nums[i] - nums[j]);
                if(z == k){
                    count++;
                }
            }
        }

        return count;
    }
}
