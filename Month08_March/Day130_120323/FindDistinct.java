package Month08_March.Day130_120323;

public class FindDistinct {
    public static void main(String[] args) {
        System.out.println(findSingleElement(new int[]{1,1,2,2,3,4,4,3,5}));
    }

    static int findSingleElement(int []A){
        int res = 0;

        for(int i : A){
            res ^= i;

        }
        return res;
    }
}
