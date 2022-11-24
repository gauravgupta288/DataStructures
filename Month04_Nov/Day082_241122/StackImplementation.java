package Month04_Nov.Day082_241122;

public class StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println(stack.push("gg"));
        System.out.println(stack.push("20"));
        System.out.println(stack.push("30"));
        System.out.println(stack.push("40"));
        System.out.println(stack.push(20));

        System.out.println(stack.pop());
        stack.print();
    }
}
