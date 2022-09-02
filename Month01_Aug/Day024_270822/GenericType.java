package gg.Month01_Aug.Day024_270822;

public class GenericType<T> {
    private T t;

    public void add(T t, T t1) {
        System.out.println("Type of T is " + t + t1);
        System.out.println(t instanceof String);
    }

    public static void main(String[] args) {
        String s = "Bunny";
        int age = 1;
        GenericType gt = new GenericType();
        gt.add(s, " Ryan");
        gt.add(age, 10);
    }
}
