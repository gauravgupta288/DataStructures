package gg.Month00_July.Archived;

public class SecondLargestInAString {
    public static void main(String s[]) {
        System.out.print(secondLargest("dfa1111"));
    }

    static int secondLargest(String str) {
        int f = -1, s = -1;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int num = (str.charAt(i)) - '0';
                if(num>f){
                    s=f;
                    f=num;
                }else if(num>s && num !=f){
                    s=num;
                }
            }
        }
        if(f==s)return -1;
        return s;
    }
}
