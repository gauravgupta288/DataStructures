package Month06_Jan.Day109_190123;



public class Test {


    public static StringBuilder append(String s, int start, int end, StringBuilder res){

        while(start < end){
            res.append(s.charAt(end--));
        }

        return res;
    }

    public void overrideMe(){
        System.out.println("parent");
    }

}

class child extends Test{
    public void overrideMe(){
        System.out.println("child");
    }
}

class Initializer{
    public static void main(String[] args) {
        Test t = new child();
        t.overrideMe();
    }
}


