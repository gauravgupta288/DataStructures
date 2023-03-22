package Month08_March.Day139_210323;

import java.util.Arrays;
import java.util.Comparator;

public class FactorsSort {
    public static void main(String[] args) {
        solve(new int[]{2,4,7});
    }

    static int[] solve(int A[]){

        Integer [] arr = Arrays.stream( A ).boxed().toArray( Integer[]::new );

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int n1 = factorCount(o1);
                int n2 = factorCount(o2);

                if(n1 == n2){
                    return Integer.compare(o1, o2);
                }
                return n1 - n2;
            }
        });

        for(int i = 0; i < A.length; i++){
            A[i] = arr[i];
        }
        return A;
    }

    static int factorCount(int n){
        int count = 0;
        for(int i = 1; i * i <= n; i++){
            int temp = n / i;
            if(temp < i){
                break;
            }
            if(n % i == 0){
                if(temp == i){
                    count++;
                }else{
                    count += 2;
                }
            }
        }
        return count;
    }
}
