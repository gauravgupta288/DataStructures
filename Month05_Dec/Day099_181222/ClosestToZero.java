package Month05_Dec.Day099_181222;

public class ClosestToZero {
    public static void main(String[] args) {
        System.out.println(findClosestNumber(new int[]{-1, -1}));
    }

    static int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        boolean negative = false;
        for(int i : nums){
            int num = Math.abs(i);

            if(num < min){
                if(i < 0){
                    negative = true;
                }else{
                    negative = false;
                }
                min = num;
            }else if(num == min){
                min = num;

                if(negative == true && i < 0){
                    negative = true;
                }else{
                    negative = false;
                }

            }
        }

        return negative == true ? -min : min;
    }
}
