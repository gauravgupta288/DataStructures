package Month05_Dec.Day096_151222;

import java.util.List;

public class Day096_141222 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,4,6,2,3);

        list.forEach(s-> System.out.println(s * 2));

        list.stream().filter(t -> t % 2 == 0).forEach(x -> System.out.println("Even number:" + x));
    }


}
