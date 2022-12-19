package Month05_Dec.Day100_191222;

public class FindTheOriginalArray {

    public static void main(String[] args) {
        System.out.print(findOriginal(new int[]{5,2,0,3,1}));
    }

    static int[] findOriginal(int[] pref) {
        if(pref.length < 2){
            return pref;
        }
        int temp = pref[0];
        int res = pref[0];
        for (int i = 0; i < pref.length -  1; i++) {
            res = temp ^ pref[i+1];
            temp = pref[i+1];
            pref[i  + 1] = res;
        }

        return pref;


    }
}
