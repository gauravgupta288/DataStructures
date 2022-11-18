package Month04_Nov.Day078_181122;

import java.util.HashMap;

public class SumToZero {
    public static void main(String[] args) {
        System.out.println(sumToZero(new int[]{15, -2, 2, -8, 1, 7, 10, 23}, 8));
    }

    static int sumToZero(int arr[], int n) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0;
            int max = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];

                if (sum == 0){
                    max = i + 1;
                }
                if(map.containsKey(sum)){
                    max =  Math.max(i - map.get(sum), max);
                }else{
                    map.put(sum, i);
                }
            }
            return max;
    }
}
