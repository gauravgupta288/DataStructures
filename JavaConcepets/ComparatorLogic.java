package JavaConcepets;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLogic {
    public static void main(String[] args) {
        cars c1 = new cars("BMW", 423234);
        cars c2 = new cars("Audi", 1232423);
        cars c3 = new cars("Benz", 2332344);
        cars c4 = new cars("Jaguar", 3523523);

        c1.toString();
        c2.toString();
        c3.toString();
        c4.toString();

        List<cars> car = Arrays.asList(c1, c2, c3, c4);
        Collections.sort(car, Comparator.comparing(o -> o.price, Comparator.reverseOrder()));
    }
}

class cars{
    private cars(){};
    String name;
    int price;
    cars(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){

        System.out.println("name: " + name + " price: " + price + "\n");
        return null;
    }
}
