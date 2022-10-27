package gg.Month03_Oct.Day058_271022;

public class TwoIndependentEvents {
    public static void main(String[] args) {
        System.out.println(twoIndependentEvents(new String[]{"16:53","19:00"}, new String[]{"10:33","18:15"}));
    }

    static boolean twoIndependentEvents(String[] event1, String[] event2) {
        String num1[] = new String[2];
        String num3[] = new String[2];
        String num2[] = new String[2];
        String num7[];
        int num4;
        int num5;
        int num6;
        int num8;
        num1 = event1[0].split(":");

        num4 = Integer.parseInt(num1[0]) * 100 + Integer.parseInt(num1[1]);

        num2 = event1[1].split(":");
        num5 = Integer.parseInt(num2[0]) * 100 + Integer.parseInt(num2[1]);

        num3 = event2[0].split(":");
        num6 = Integer.parseInt(num3[0]) * 100 + Integer.parseInt(num3[1]);

        num7 = event2[1].split(":");
        num8 = Integer.parseInt(num7[0]) * 100 + Integer.parseInt(num7[1]);

        return num6 >= num4 && num6 <= num5 || num8 >= num4 && num8 <= num5 ? true : false;
    }
}
