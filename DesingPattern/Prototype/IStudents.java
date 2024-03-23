package DesingPattern.Prototype;

public class IStudents extends Student{
    int iq;

    public IStudents(){

    }

    public  IStudents(IStudents is){
        super(is);
        this.iq = is.iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IStudents copy(){
        return new IStudents(this);
    }
}
