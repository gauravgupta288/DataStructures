package DesingPattern.Prototype;

public class main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        fillRegistry(registry);

        Student kote = registry.get("st1").copy();

        System.out.println("deb");
    }
    public static void fillRegistry(StudentRegistry registry){
        Student st = new Student();

        st.setbName("gg");
        st.setAvgBatchPsp(11);

        registry.set("st", st);

        IStudents st1 = new IStudents();

        st1.setAvgBatchPsp(111);
        st1.setbName("tutu");
        st1.setIq(1111);
        registry.set("st1", st1);
    }
}
