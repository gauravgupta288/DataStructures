package JavaConcepets;

import java.util.Arrays;
import java.util.Optional;

public class Reduce {
    static {
        System.out.println("static block 1");
    }

    static {
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        Optional ans = Arrays.asList("oscar", "papa", "tango").stream()
                .reduce((a,b) -> a.length() < b.length() ? a : b);

        System.out.println(ans.get());
    }
}
