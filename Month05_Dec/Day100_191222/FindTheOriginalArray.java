package Month05_Dec.Day100_191222;

public class FindTheOriginalArray {

    public static void main(String[] args) {
        System.out.print(findOriginal(new int[]{5}));
    }

    static int[] findOriginal(int[] pref) {
        int temp = 0;
        int arr[] = new int[pref.length];
        arr[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            int k = pref[i - 1];
            temp = pref[i];
            arr[i] = k ^ temp;
        }

        return arr;


    }
}
