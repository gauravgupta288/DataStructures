package Month04_Nov.Day087_291122;

import java.util.*;
import java.util.stream.*;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        List<Integer> val = list.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());

        list.stream().forEach(i->{
            System.out.println(i*i);
        });

        System.out.println(val);

        Stream<String> stream = Stream.of("gg", "bunny", "neha");

        System.out.println(stream.anyMatch(x -> x.equals("ggg")));

    }

}
