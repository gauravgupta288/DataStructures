package JavaConcepets;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApis {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 5, 6, 67, 8, 7, 6);

        //list.add("baba");
        System.out.println(list);

        List<Integer> s = list.stream().filter(list1 -> list1 % 2 != 0).collect(Collectors.toList());

        System.out.println(s);
    }
}
