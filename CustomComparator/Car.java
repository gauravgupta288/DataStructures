package CustomComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Car implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {

        return o1.price - o2.price;
    }

    public static void main(String[] args) {
        Cars c1 = new Cars(4, "BMW", 100000);
        Cars c2 = new Cars(4, "Audi", 100002);
        Cars c3 = new Cars(4, "Audi", 9000);

        List<Cars> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);cars.add(c3);

        Collections.sort(cars, new Car());

        System.out.println(cars);
    }
}
