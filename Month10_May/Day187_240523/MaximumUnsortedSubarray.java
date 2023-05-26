package Month10_May.Day187_240523;

public class MaximumUnsortedSubarray {
    public static void main(String[] args) {
        System.out.println(subarray(new int[]{1,1,10,10,15,10,15,10,10,15,10,15}));
    }

    static int[] subarray(int A[]){
        int max = 0;
        for(int i :A){
            max = Math.max(max, i);
        }
        int[] newArray = new int[max+1];

        for(int i = 0; i < A.length; i++){
            newArray[A[i]]++;
        }

        int k = 0;
        int ans[] = new int[2];
        int start = -1;
        int end = -1;
        for(int i = 1; i < newArray.length; i++){
            for(int j = 0; j < newArray[i];j++){
                if(A[k] != i){
                    if(start == -1){
                        start = k;
                    }else{
                        end = k;
                    }
                }
                k++;
            }
        }

        ans[0] = start;
        ans[1] = end;

        return start == -1 ? new int[]{-1} : ans;
    }
}
