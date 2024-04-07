package JavaConcepets;

public interface Animal {
    public static final int a = 790;
    public default void run() {
        System.out.println("Run" + a);
    }

    void eat();
}

class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat is eating" + a);
    }
}

class Run{
    public static void main(String[] args) {
        Animal ani = new Cat();
        ani.eat();
//        Animal.run();
        ani.run();
    }

}

abstract class Shape{
    int a = 10;

    abstract void test();
}