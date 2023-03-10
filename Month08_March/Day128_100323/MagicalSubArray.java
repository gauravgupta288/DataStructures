package Month08_March.Day128_100323;

public class MagicalSubArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3,3,2,2,5,3,3,3,5}));
    }

    static int solve(int[] A){
        int count = 0;
        int max = 0;

        int j = 0;
        for(int i = 0; i < 5; i++){
            while(j <= i){
                System.out.println(i+j);
                j++;
            }
        }

        for(int i : A){
            if(i % 2 == 0 || i % 3 == 0){
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
        }

        return max;
    }
}
