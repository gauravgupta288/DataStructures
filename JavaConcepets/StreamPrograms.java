package JavaConcepets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamPrograms {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,1118,49,25,98,32);

        myList
                .stream()
                .filter(val -> (val + "").startsWith("1"))
                .forEach(System.out::println);

        findDuplicate();
    }

    public static void findDuplicate(){
        List<Integer> myList = Arrays.asList(10,15,1118,49,25,98,32, 10, 15);

        Set<Integer> set = new HashSet<>();
        myList
                .stream()
                .filter(val -> !set.add(val))
                .forEach(System.out::println);

        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Integer max = myList1.stream().min(Integer::compare).get();

        System.out.println(max);
    }
}
