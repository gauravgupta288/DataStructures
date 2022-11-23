package Month04_Nov.Day082_231122;

import java.util.List;

public class SplitArray {
    public static void main(String[] args) {
        System.out.println(split(List.of(10, 4, -8, 7)));
    }

    static int split(List<Integer> arr){
        int sum1 = arr.get(0);
        int sum2 = 0;
        int count = 0;
        for(int i = 1;i<arr.size(); i++){
            sum2 += arr.get(i);

        }
        if(sum1 > sum2){
            count++;
        }
        for(int i = 1;i<arr.size()-1; i++){
            sum1 += arr.get(i);
            sum2 -= arr.get(i);
            if(sum1 > sum2){
                count++;
            }
        }

        return count;
    }
}
