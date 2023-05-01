package Month10_May.Day171_010523;

public class SmallerSum {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{24, 22, 2, 2, 8}));
    }
    static int sum(int[] A){
        int smallest = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;
        int sum = 0;

        for(int i : A){
            if(i < smallest){
                ssmall = smallest;
                smallest = i;
            }else if( i < ssmall){
                ssmall = i;
            }
        }
        for(int i : A){
            if(i > smallest && i > ssmall){
                sum += i;
            }
        }

        return (sum) % 1000000007;
    }
}
