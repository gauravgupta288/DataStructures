package Month07_Feb.Day118_280223;

public class LightTheBulbs {
    public static void main(String[] args) {
        System.out.println(solve2(new int[]{1,1,1,0,0}));
    }

    static int solve(int[] A){
        int count = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                count++;
                for(int j = i; j < A.length; j++){
                    if(A[j] == 0){
                        A[j] = 1;
                    }else{
                        A[j] = 0;
                    }
                }
            }
        }

        return count;
    }

    static int solve2(int []A){
        int count = 0;
        int state = 0;
        for(int i = 0; i < A.length; i++){
            if(count % 2 != 0){
                A[i] = 1 - A[i];
            }

            if(A[i] == 0){
                count++;
            }
        }

        return count;
    }
}
