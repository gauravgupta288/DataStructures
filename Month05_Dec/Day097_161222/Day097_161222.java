package Month05_Dec.Day097_161222;

public class Day097_161222 {

    public static void main(String[] args) {
        System.out.println(factor(new int[]{9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24}));
    }

    static int factor(int[] nums) {

        int negative = 0;
        for (int i : nums) {
            if(i == 0){
                return 0;
            }else if(i < 0){
                negative++;
            }
        }

        return negative % 2 == 0 ? 1 : -1 ;
    }
}
