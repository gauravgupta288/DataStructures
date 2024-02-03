package DesingPattern.Prototype;

public class Student implements Prototype<Student>{
    private int psp;
    private String name;
    private String bName;
    private double avgBatchPsp;

    Student(){}
    Student(Student student){
        this.psp = student.psp;
        this.name = student.name;
        this.bName = student.bName;
        this.avgBatchPsp = student.avgBatchPsp;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
