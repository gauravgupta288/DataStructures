package Month05_Dec.Day094_081222;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello world");

        int a[] = {1,2,3,4};
        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.stream(a).forEach(i ->arr.add(i) );


        System.out.println();
    }
}
