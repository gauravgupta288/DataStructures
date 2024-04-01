package JavaConcepets;

public interface Animal {
    public default void run() {
        System.out.println("Run");
    }

    void eat();
}

class Cat implements Animal{

    @Override
    public void eat() {
        System.out.println("Cat is eating");
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
