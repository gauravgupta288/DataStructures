package Month13_Aug.Day219_260823_Recurtion;

public class PrintOneTwoN {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        if(n==0){
            return ;
        }
        System.out.print(n + " ");
        print(n-1);

    }
}
