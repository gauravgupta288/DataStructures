package Month08_March.Day120_020323;

public class GoodSubArrays {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9}, 65));
    }

    static int solve(int[] A, int B){
        int count = 0;
        int n = A.length;
        for(int i = 1; i < n; i++){
            A[i] += A[i - 1];
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j += 2){
                if(i == 0 && A[j] < B){
                    count++;
                }else {
                    if(i != 0 && A[j] - A[i - 1] < B){
                        count++;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j += 2){
                if(i == 0 && A[j] > B){
                    count++;
                }else {
                    if(i != 0 && A[j] - A[i - 1] > B){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
