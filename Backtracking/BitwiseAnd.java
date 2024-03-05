package Backtracking;

public class BitwiseAnd {
    public static void main(String[] args) {
        int left = 4;
        int right = 7;
        for(int i = right - 1; i >=left;i--){
            right = right & i;

//            i = right;

            //0111
            //0110
        }

        System.out.println(right);
    }
}
