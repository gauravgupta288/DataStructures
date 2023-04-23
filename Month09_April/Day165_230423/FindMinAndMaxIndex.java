package Month09_April.Day165_230423;

public class FindMinAndMaxIndex {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5,3,9,8,1,6,8,1,2,9,1}));
    }
    static int solve(int []arr){
        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (minIndex == -1 || arr[i] < arr[minIndex]) {
                minIndex = i;
            }
            if (maxIndex == -1 || arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        if (minIndex == -1) {
            return 0;
        } else if (maxIndex == minIndex) {
            return 1;
        } else {
            return Math.abs(maxIndex - minIndex) + 1;
        }
    }
}
