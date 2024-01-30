package DesingPattern.Builder;

public class Student {
    String name;
    int psp;
    int roll;
    String uniName;

    int gradYear;

    private Student(Builder builder){
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.roll = builder.getRoll();
        this.uniName = builder.getUniName();
        this.gradYear = builder.getGradYear();
    }

    public String getName() {
        return name;
    }

    public int getPsp() {
        return psp;
    }

    public int getRoll() {
        return roll;
    }

    public String getUniName() {
        return uniName;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder{
        String name;
        int psp;
        int roll;
        String uniName;
        int gradYear;

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return  this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return  this;
        }

        public int getPsp() {
            return psp;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return  this;
        }

        public int getRoll() {
            return roll;
        }

        public Builder setRoll(int roll) {
            this.roll = roll;
            return  this;
        }

        public String getUniName() {
            return uniName;
        }

        public Builder setUniName(String uniName) {
            this.uniName = uniName;
            return  this;
        }

        public Student build(){
            if(this.gradYear < 2023){
                throw new IllegalArgumentException("Grad year should be greater then 2022");
            }
            return new Student(this);
        }
    }
}
