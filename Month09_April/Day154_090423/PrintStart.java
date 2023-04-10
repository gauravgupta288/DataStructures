package Month09_April.Day154_090423;

public class PrintStart {
    public static void main(String[] args) {
        print(5);
        String str = "Automation";
        reverse(str, str.length() - 1);
    }

    static void print(int n){
        if(n == 0){
            return;
        }

        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
        print(n - 1);
    }

    static void reverse(String str, int n){
        if(n == 0){
            System.out.print(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        reverse(str, n - 1);
    }
}
