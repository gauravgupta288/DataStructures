package JavaConcepets;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMaps {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,5,6,67,8,7);

        List<Integer> list1 = list.stream().limit(list.size()/2).collect(Collectors.toList());

        List<Integer> list2 = list.stream().skip(list.size()/2).collect(Collectors.toList());
        System.out.println(list2);

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

        streamApi();

        // Generate a large list of integers
        List<Integer> numbers = generateLargeList();

        // Calculate sum of squares sequentially
        long startTimeSeq = System.currentTimeMillis();
        long sumOfSquaresSeq = calculateSumOfSquaresSequential(numbers);
        long endTimeSeq = System.currentTimeMillis();
        System.out.println("Sequential sum of squares: " + sumOfSquaresSeq);
        System.out.println("Sequential time taken: " + (endTimeSeq - startTimeSeq) + " ms");

        // Calculate sum of squares in parallel
        long startTimeParallel = System.currentTimeMillis();
        long sumOfSquaresParallel = calculateSumOfSquaresParallel(numbers);
        long endTimeParallel = System.currentTimeMillis();
        System.out.println("Parallel sum of squares: " + sumOfSquaresParallel);
        System.out.println("Parallel time taken: " + (endTimeParallel - startTimeParallel) + " ms");

    }

    public static void compare(){

        Comparator<Integer> com = Comparator.reverseOrder();

        List<Integer> li = Arrays.asList(1,3,2,4,5);
        System.out.println(li);
        Collections.sort(li, com);
        System.out.println(li);
    }

    public static void  streamApi(){
        List<String> stringList = Arrays.asList("j", "helljj", "yeah", "java", "hello");

        for(int i = 0; i < 5; i++){
            Optional<String> len = stringList.parallelStream().filter(name -> name.startsWith("j")).findAny();

            System.out.println(len.get());
        }


    }

    // Generate a large list of integers
    public static List<Integer> generateLargeList() {
        return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10_000_000);
    }

    // Calculate sum of squares sequentially
    public static long calculateSumOfSquaresSequential(List<Integer> numbers) {
        return numbers.stream()
                .mapToLong(num -> num * num)
                .sum();
    }

    // Calculate sum of squares in parallel
    public static long calculateSumOfSquaresParallel(List<Integer> numbers) {
        return numbers.parallelStream()
                .mapToLong(num -> num * num)
                .sum();
    }
}
