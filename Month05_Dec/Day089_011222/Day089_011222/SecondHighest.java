package Month05_Dec.Day089_011222.Day089_011222;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SecondHighest {

    public static void main(String[] args) {
        List<Integer> salary = List.of(10, 20, 21, 34, 12, 4);

        Optional<Integer> max = salary.stream().sorted().limit(2) .findFirst()
                ;

        System.out.println(max);
    }
}
