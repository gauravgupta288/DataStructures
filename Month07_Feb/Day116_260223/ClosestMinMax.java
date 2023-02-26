package Month07_Feb.Day116_260223;

public class ClosestMinMax {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1}));
    }

    static int solve(int[] A){
        int count = 0;
        int max = A[0];
        int min = A[0];
        int ans = A.length;
        int minIndex = -1;
        int maxIndex = -1;



        for(int i : A){
            if( i > max){
                max = i;
            }
            if(min > i){
                min = i;
            }
        }

        if(max == min){
            return 1;
        }

        for(int i = 0; i < A.length; i++){
            if(max == A[i]){
                if(minIndex != -1){
                    ans = Math.min(ans, i - minIndex + 1);
                }
                maxIndex = i;
            }else if(min == A[i]){
                if(maxIndex != -1){
                    ans = Math.min(ans, i - maxIndex + 1);
                }
                minIndex = i;
            }
        }

        return ans;
    }
}
