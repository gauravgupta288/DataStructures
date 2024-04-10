package JavaConcepets;

import java.util.Arrays;
import java.util.List;

public class CollectionsExamples {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,3,5,7,6);

        int arr[] = new int[]{1,4,3,2};
       // Collections.sort(list);

        System.out.println(list);

        Arrays.sort(arr, 0, arr.length );


        Arrays.stream(arr).forEach(System.out::println);

    }
}
