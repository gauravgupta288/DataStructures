package Month06_Jan.Day108_160123;

public class FindSubStringCount {
    public static void main(String[] args) {
        String str = "Hello World, Hello Java Hello";
        String sub = "Hello";
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }
        System.out.println("The substring '" + sub + "' appears " + count + " times in the string '" + str + "'.");
    }

}
