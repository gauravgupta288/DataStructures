package JavaConcepets;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class StreamMaps {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,5,6,67,8,7);

        long t = list.stream().filter(l -> l % 2 == 0).mapToInt(Integer::intValue).sum();

        System.out.println(t);

        BiFunction<Integer, Integer,  Integer> sq = (num1, num2) -> num1 * num2;
        System.out.println(sq.apply(10, 20));

        Function<Integer, Integer> sq1 = (num1) -> num1 * num1;
        System.out.println(sq1.apply(10));

        Comparator<Integer> com = Comparator.reverseOrder();

        //Comparator.reverseOrder()

        System.out.println(com.compare(3,2));

        compare();
    }

    public static void compare(){

        Comparator<Integer> com = Comparator.reverseOrder();

        List<Integer> li = Arrays.asList(1,3,2,4,5);
        System.out.println(li);
        Collections.sort(li, com);
        System.out.println(li);
    }
}
