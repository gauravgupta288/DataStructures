package Month07_Feb.Day117_270223;

public class PickFromBothSide {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645, 185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646, 982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832, -982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628, -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985, 102, -520, 213, 627, -198, -901, -473, -375, 543, 924, 23, 972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587, -26, -730, 170, -765, -167, 711, 760, -104, -333 }, 32));
    }

    static int solve(int[] A, int B){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = A.length;
        int prefixSum[] = new int[n];
        int postFixSum[] = new int[n];

        prefixSum[0] = A[0];
        postFixSum[n - 1] = A[n - 1];

        for(int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + A[i];
        }

        for(int i = n - 2; i >= 0; i--){
            postFixSum[i] = postFixSum[i + 1] + A[i];
        }

        for(int i = 0; i <= B; i++){
            if(i == 0){
                max = Math.max(max, prefixSum[B - 1]);
            }else if(B - i == 0){
                max = Math.max(max, postFixSum[ n - B]);
            }else{
                max = Math.max(max, prefixSum[B - i - 1] + postFixSum[ n - i]);
            }
        }
        return max;
    }
}
