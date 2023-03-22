package Month08_March.Day139_210323;

import java.util.Arrays;
import java.util.Comparator;

public class TensDigitSorting {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{15, 11, 7, 19}));
    }

    static int[] solve(int A[]) {
        Integer[] a = Arrays.stream( A ).boxed().toArray( Integer[]::new );
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                int t1 = o1 / 10 % 10; // get the tens digit of the first number
                int t2 = o2 / 10 % 10;

                if(t1 == t2){
                   return Integer.compare(o2, o1);
                }
                return t1 - t2;

            }
        });

        for(int i = 0; i < A.length; i++){
            A[i] = a[i];
        }
        return A;
    }
}
