package Month06_Jan.Day109_190123;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


    public static StringBuilder append(String s, int start, int end, StringBuilder res){
        WebDriver driver = new ChromeDriver();
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
    }
}


