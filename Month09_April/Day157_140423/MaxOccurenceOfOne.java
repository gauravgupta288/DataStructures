package Month09_April.Day157_140423;

public class MaxOccurenceOfOne {
    public static void main(String[] args) {
        System.out.println(max(new int[]{1,1,1,1,0,1,1,1,1,1,0,0,1,1,1}));
    }

    static int max(int[] A){
        int max = 0;
        int count = 0;


        for(int i = 0 ; i < A.length; i++){
            if(A[i] == 1){
                count++;
            }else{
                max = Math.max(max, count);
                count = 0;
            }
        }

        return max > count ? max : count;
    }
}
