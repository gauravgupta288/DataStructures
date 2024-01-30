package DesingPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setGradYear(2023)
                .setName("gaurav")
                .setPsp(100)
                .setRoll(101)
                .setUniName("Pune Uni")
                .build();
        System.out.println(student);
    }
}
