package DesingPattern.Factory.Componenets;

public class IOSButton implements Button{
    @Override
    public void click() {
        System.out.println("IOS click");
    }
}
