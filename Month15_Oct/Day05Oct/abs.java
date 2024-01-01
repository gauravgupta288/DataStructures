package Month15_Oct.Day05Oct;

public class abs{
    abs a = null;
   private abs(){
        System.out.println("constructor");
    }

    public abs getInstance(){
       if(a == null) {
           a = new abs();
           return  a;
       }
       return a;
    }
}

class test{
    public static void main(String[] args) {
    }
}


