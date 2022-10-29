package gg.Month03_Oct.Day060_291022;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        long now = System.currentTimeMillis();

        slow();
        System.out.println( System.currentTimeMillis() - now + "ms");

        now = System.currentTimeMillis();

        fast();
        System.out.println( System.currentTimeMillis() - now + "ms");
    }

    static void slow(){
        String s = "";
        for(int i = 0;i<10000;i++){
            s += "*";
        }
    }

    static void fast(){
        StringBuilder s = new StringBuilder();
        for(int i = 0;i<10000;i++){
            s.append("*");
        }
    }
}
