package DesingPattern.Factory.Componenets;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Android click");
    }
}
