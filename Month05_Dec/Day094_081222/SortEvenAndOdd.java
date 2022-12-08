package Month05_Dec.Day094_081222;

public class SortEvenAndOdd {
    public static void main(String[] args) {
        sortEvenOddIndices(new int[]{36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34});
    }

    static int[] sortEvenOddIndices(int[] nums){
        int ans[] = new int[nums.length];
        int oddIndexes[] = new int[101];
        int evenIndexes[] = new int[101];


        for(int i =1; i < nums.length;i = i+2){
            oddIndexes[nums[i]]++;
        }

        for(int i = 0; i < nums.length;i = i+2){
            evenIndexes[nums[i]]++;
        }

        int j = 1;
        for(int i = oddIndexes.length - 1; i>=0;i--){
            int len = oddIndexes[i];
            while(len > 0){
                ans[j] = i;
                j = j + 2;
                len--;
            }
        }

        int k = 0;
        for(int i = 0; i< evenIndexes.length;i++){
            int len = evenIndexes[i];
            while(len > 0){
                ans[k] = i;
                k = k + 2;
                len--;
            }
        }

        return ans;
    }
}
