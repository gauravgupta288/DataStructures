package Month08_March.Day138_200323;

public class SubarraysWithBitwiseOR1 {
    public static void main(String[] args) {
        System.out.println(solve(5, new int[]{0,1,0,0,0}));
    }

    static long solve(int A, int[] B){
        int last=0;
        long ans=0;
        for(int i=0;i<A;i++){
            if(B[i]==1)last=i+1;
            ans += last;
        }
        return ans;

    }
}
