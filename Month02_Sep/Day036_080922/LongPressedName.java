package gg.Month02_Sep.Day036_080922;

public class LongPressedName {
    public static void main(String[] args) {
        System.out.println(longPressedName("saeed", "ssaaedd"));
    }

    static boolean longPressedName(String name, String typed) {

        int k =0;
        for(int i = 0;i<name.length();i++){
            if(k<typed.length() && name.charAt(i) == typed.charAt(k)){
                while(k<typed.length() && name.charAt(i) == typed.charAt(k)){
                    k++;
                }
            }else if(name.charAt(i) == typed.charAt(k-1)){
                continue;
            }else{
                return false;
            }
        }

        return true;
    }
}
