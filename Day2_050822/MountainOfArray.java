package gg.Day2_050822;

public class MountainOfArray {
    public static void main(String[] args) {
        System.out.println(mountainOfArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }

    static boolean mountainOfArray(int arr[]) {
        boolean fPick = false;
        boolean fDown = false;
        boolean fUp = false;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1])return false;
            if (arr[i] > arr[i - 1]) {
                fUp = true;

                if(fPick)return false;
                else{
                    if(fDown)return false;
                }
            } else {
                if (!fUp) return false;
                else {
                    fPick = true;
                }
                fDown = true;
            }
        }
        if(!fDown) return false;
        return true;
    }
}
