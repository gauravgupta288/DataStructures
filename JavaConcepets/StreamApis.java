package JavaConcepets;

import java.util.List;
import java.util.stream.Collectors;

public class StreamApis {
    public static void main(String[] args) {
        List<String> list = List.of("dsad", "dsd", "eww", "bsds", "dd", "db", "bbb");

        //list.add("baba");
        System.out.println(list);

        List<Integer> s = list.stream().filter(list1 -> list1.startsWith("b")).map(list1 -> list1.length()).collect(Collectors.toList());

        System.out.println(s);
    }
}
