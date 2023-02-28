package Month07_Feb.Day117_270223;

public class PickFromBothSide {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322, -667, 673, -336, 141, 711, -747, -132, 547, 644, -338, -243, -963, -141, -277, 741, 529, -222, -684, 35}, 48));
    }

    static int solve(int[] A, int B){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 1; i < A.length; i++){
            A[i] += A[i - 1];
        }



        return max;
    }
}
